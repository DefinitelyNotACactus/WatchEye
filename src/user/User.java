/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author David
 */
public class User implements Serializable{

    private static final long serialVersionUID = 147788L;

    //Creation Fields
    private String name;
    private String email;
    private String password;
    private int gender;
    private final String dob;
    
    //Array Fields
    private ArrayList<User> buddies;
    private ArrayList<User> buddies_request;
    
    private ArrayList<User> blocked;
    
    public User(String name, String email, String password, int gender, String dob){
        this.name = name;
        this.email = email.toLowerCase();
        this.password = password;
        this.gender = gender;
        this.dob = dob;
        buddies = new ArrayList<>();
        buddies_request = new ArrayList<>();
        blocked = new ArrayList<>();
    }
    
    public void serialize(){
        try {
            ObjectOutputStream out;
            try (FileOutputStream fileOut = new FileOutputStream("data/users/" + email + ".ser")) {
                out = new ObjectOutputStream(fileOut);
                out.writeObject(this);
                out.close();
            }
            out.close();
        } catch (IOException i) {
        }
    }
    
    public void addFriend(User toAdd){
        buddies.add(toAdd);
    }
    
    public void removeFriend(User toRemove){
        Iterator<User> it = buddies.iterator();
        while(it.hasNext()){
            User currentFriend = it.next();
            if(toRemove.getMail().equals(currentFriend.getMail())){
                it.remove();
                break;
            }
        }
    }
    
    public ArrayList<User> getFriendList(){
        return buddies;
    }
    
    public boolean isFriend(String mailToSearch){
        Iterator<User> it = buddies.iterator();
        while(it.hasNext()){
            User currentBuddy = it.next();
            if(mailToSearch.equals(currentBuddy.getMail())){
                return true;
            }
        }
        return false;
    }
    
    public void addFriendRequest(User newRequest){
        if(newRequest != null && !isFriend(newRequest.getMail()) && !isDuplicateRequest(newRequest.getMail())){
            buddies_request.add(newRequest);
        }
    }
    
    public void removeFriendRequest(User toRemove){
        Iterator<User> it = buddies_request.iterator();
        while(it.hasNext()){
            User currentRequest = it.next();
            if(toRemove.getMail().equals(currentRequest.getMail())){
                it.remove();
                break;
            }
        }
    }
    
    public boolean isDuplicateRequest(String email){
        Iterator<User> it = buddies_request.iterator();
        while(it.hasNext()){
            User currentRequest = it.next();
            if(email.equals(currentRequest.getMail())){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<User> getFriendRequestList(){
        return buddies_request;
    }
    
    public boolean isBlocked(String mailToSearch){
        Iterator<User> it = blocked.iterator();
        while(it.hasNext()){
            User currentBlocked = it.next();
            if(mailToSearch.equals(currentBlocked.getMail())){
                return true;
            }
        }
        return false;
    }
    
    public void blockUser(User toBlock){
        blocked.add(toBlock);
    }
    
    public void unblockUser(User toUnblock){
        Iterator<User> it = blocked.iterator();
        while(it.hasNext()){
            User currentBlocked = it.next();
            if(toUnblock.getMail().equals(currentBlocked.getMail())){
                it.remove();
                break;
            }
        }
    }
    
    public ArrayList<User> getBlockedList(){
        return blocked;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
    
    public String getMail(){
        return email;
    }
    
    public void setMail(String newMail){
        email = newMail;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String newPassword){
        password = newPassword;
    }
    
    public int getGender(){
        return gender;
    }
    
    public void setGender(int newGender){
        gender = newGender;
    }
}
