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
public class User implements Serializable {
    
    //Creation Fields
    private String name;
    private String email;
    private String password;
    private int gender;
    private String dob;
    
    //Array Fields
    private ArrayList<String> buddies;
    private ArrayList<String> blocked;
    
    public User(String name, String email, String password, int gender, String dob){
        this.name = name;
        this.email = email.toLowerCase();
        this.password = password;
        this.gender = gender;
        this.dob = dob;
        buddies = new ArrayList<>();
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
    
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
    
    public String getMail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
}
