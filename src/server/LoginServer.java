/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import executable.WatchEye;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import user.User;
import util.Serializator;

/**
 *
 * @author David
 */
public class LoginServer implements Serializable {

    private static final long serialVersionUID = 131831L;

    private static LoginServer instance = new LoginServer();
    
    //Login Field
    private HashMap<String, String> user = new HashMap<>();
    
    //Request Field
    private HashMap<String, ArrayList<User>> request = new HashMap<>();
    
    //Transient Fields
    private transient User currentUser = null;
    private transient WatchEye client;
    
    private LoginServer(){
        deserialize();
    }
    
    public static LoginServer getInstance(){
        return instance;
    }
    
    public void shutdown(){
        if(currentUser != null){
            currentUser.serialize();
        }
        serialize();
    }
    
    private void serialize(){
        try {
            try (FileOutputStream fileOut = new FileOutputStream("data/server.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(instance);
            }
        } catch (IOException i) {
        }
    }
    
    private void deserialize(){
        try {
            try (FileInputStream fileIn = new FileInputStream("data/server.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
                instance = (LoginServer) in.readObject();
                user = instance.user;
            }
        } catch (IOException | ClassNotFoundException i) {
        }
    }
    
    public void addUser(User newUser){
        user.put(newUser.getMail().toLowerCase(), newUser.getPassword());
    }
    
    public void enter(String mail, String password){
        if(user.containsKey(mail.toLowerCase())){
            if(user.get(mail.toLowerCase()).equals(password)){
                login(Serializator.deserializeUser(mail));
            } else {
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(client.getLoginScreen(), "Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);   
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(client.getLoginScreen(), "E-mail não cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);  
        }
    }
    
    public void login(User user){
        currentUser = user;
        String mail = user.getMail();
        if(request.containsKey(mail)){
            Iterator<User> it = request.get(mail).iterator();
            while(it.hasNext()){
                User requester = it.next();
                user.addFriendRequest(requester);
                it.remove();
            }
            request.remove(user.getMail());
        }
        client.welcome(currentUser);
    }
    
    public void logoff(){
        currentUser.serialize();
        currentUser = null;
    }
    
    public User getCurrentUser(){
        return currentUser;
    }
    
    public void setClient(WatchEye client){
        this.client = client;
    }
    
    public boolean emailInUse(String email){
        return user.containsKey(email);
    }
    
    public void addNewFriendRequest(String email, User user){
        request.putIfAbsent(email, new ArrayList<>());
        boolean newEntry = true;
        Iterator<User> it = request.get(email).iterator();
        while(it.hasNext()){
            if(it.next().getMail().equals(user.getMail())){
                newEntry = false;
                break;
            }
        }
        if(newEntry){
            request.get(email).add(user);
        }
    }
    
    public void friendRequestResponse(int id, boolean accept){
        User sender = Serializator.deserializeUser(currentUser.getFriendRequestList().get(id).getMail());
        if(accept){
            currentUser.addFriend(sender);
            sender.addFriend(currentUser);
        }          
        sender.serialize();
        currentUser.getFriendRequestList().remove(id);
        currentUser.serialize();
        client.updateAndListFriendPanel(currentUser);
    }
    
    public void removeFriend(int id, boolean block){
        User removed = Serializator.deserializeUser(currentUser.getFriendList().get(id).getMail());
        if(block){
            currentUser.blockUser(removed);
        }
        removed.removeFriend(currentUser);
        removed.serialize();
        currentUser.getFriendList().remove(id);
        currentUser.serialize();
        client.updateAndListFriendPanel(currentUser);
    }
    
    public boolean blockedByReceiver(String email){
        User toCheck = Serializator.deserializeUser(email);
        return toCheck.isBlocked(currentUser.getMail());
    }
    
    public void unblock(int id){
        currentUser.getBlockedList().remove(id);
        currentUser.serialize();
        client.updateAndListFriendPanel(currentUser);
    }   
}
