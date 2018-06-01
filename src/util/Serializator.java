/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import user.User;

/**
 *
 * @author David
 */
public class Serializator implements Serializable{
    
    public static User deserializeUser(String user){
        try {
            try (FileInputStream fileIn = new FileInputStream("data/users/" + user + ".ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
                return (User) in.readObject();
            }
        } catch (IOException | ClassNotFoundException i) {
        }
        return null;
    }
    
    public static void serializeUser(User user){
        try {
            FileOutputStream fileOut = new FileOutputStream("data/users/" + user.getMail() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            out.close();
        } catch (IOException i) {
        }
    }
    
}
