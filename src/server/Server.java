/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import user.User;

/**
 *
 * @author David
 */
public class Server implements Serializable {
    
    private static Server instance = deserialize();
    //Login Field
    private HashMap<String, String> user;
    private User currentUser = null;
    
    private Server(){
        user = new HashMap<>();
    }
    
    public static Server getInstance(){
        return instance;
    }
    
    public void shutdown(){
        if(currentUser != null){
            currentUser.serialize(currentUser);
        }
        serialize();
    }
    
    private void serialize(){
        try {
            FileOutputStream fileOut = new FileOutputStream("server.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(instance);
            out.close();
            fileOut.close();
        } catch (IOException i) {
        }
    }
    
    private static Server deserialize(){
        try {
            FileInputStream fileIn = new FileInputStream("server.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Server server = (Server) in.readObject();
            in.close();
            fileIn.close();
            return server;
        } catch (IOException | ClassNotFoundException i) {
        }
        return new Server();
    }
    
    public void addUser(User newUser){
        user.put(newUser.getMail(), newUser.getPassword());
    }
    
    public void login(String mail, String password){
        if(user.containsKey(mail)){
            if(user.get(mail).equals(password)){
                try {
                    FileInputStream fileIn = new FileInputStream(mail + ".ser");
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    setCurrentUser((User) in.readObject());
                    in.close();
                    fileIn.close();
                } catch (IOException | ClassNotFoundException i) {
                }
            } else {
                System.out.println("Senha errada");
            }
        }
    }
    
    public void setCurrentUser(User user){
        currentUser = user;
    }
    
    public User getCurrentUser(){
        return currentUser;
    }
}
