/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socketclient;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class UserManager {
       public static HashMap<String, String> users = new HashMap<>();

    public static boolean register(String username, String password) {

        if(users.containsKey(username)){
            return false;
        }

        users.put(username, password);
        return true;
    }

    public static boolean login(String username, String password){

        if(!users.containsKey(username)){
            return false;
        }

        return users.get(username).equals(password);
    }

}
