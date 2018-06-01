/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.handlers;

import java.awt.Toolkit;
import server.LoginServer;
import user.User;

/**
 *
 * @author David
 */
public class FriendRequestHandler extends AbstractRequestHandler {
    
    private User user;
    
    public FriendRequestHandler(String email, User user){
        if(!LoginServer.getInstance().emailInUse(email)){
            Toolkit.getDefaultToolkit().beep();
        } else {
            this.user = user;
        }
        LoginServer.getInstance().addNewFriendRequest(email, user);
    }
    
}
