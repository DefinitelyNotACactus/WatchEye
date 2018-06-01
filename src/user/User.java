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

/**
 *
 * @author David
 */
public class User implements Serializable{
    
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
    
    public void serialize(User user){
        try {
            FileOutputStream fileOut = new FileOutputStream("data/users/" + email + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            out.close();
        } catch (IOException i) {
        }
    }
    
    public void addFriend(User toAdd){
        buddies.add(toAdd);
    }
    
    public void removeFriend(User toRemove){
        if(buddies.contains(toRemove)){
            buddies.remove(toRemove);
        }
    }
    
    public ArrayList<User> getFriendList(){
        return buddies;
    }
    
    public void addFriendRequest(User newRequest){
        if(newRequest != null){
            buddies_request.add(newRequest);
        }
    }
    
    public void removeFriendRequest(User toRemove){
        if(buddies_request.contains(toRemove)){
            buddies_request.remove(toRemove);
        }
    }
    
    public ArrayList<User> getFriendRequestList(){
        return buddies_request;
    }
    
    public void blockUser(User toBlock){
        blocked.add(toBlock);
    }
    
    public void unblockUser(User toUnblock){
        if(blocked.contains(toUnblock)){
            blocked.remove(toUnblock);
        }
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
