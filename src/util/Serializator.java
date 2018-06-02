/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import user.User;

/**
 *
 * @author David
 */
public class Serializator {
    
    public static User deserializeUser(String userEmail){
        try {
            try (FileInputStream fileIn = new FileInputStream("data/users/" + userEmail + ".ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
                return (User) in.readObject();
            }
        } catch (IOException | ClassNotFoundException i) {
        }
        return null;
    }
    
}
