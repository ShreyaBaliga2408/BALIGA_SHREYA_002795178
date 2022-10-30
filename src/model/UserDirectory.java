/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Shreya Baliga
 */
public class UserDirectory {
    
    ArrayList<User> userDir;
    
    public UserDirectory(){
        userDir = new ArrayList<User>();
        addLogins();
    }
    
    public User getUserByUsername(String userName){
        
        for(User us:this.getUserDir()){
            if(us.getUsername().equals(userName)){
                return us;
            }
        }
        return null;
    }
    
    public User addUser(){
        User usr = new User();
        userDir.add(usr);
        return usr;
    }
    
    public void addLogins(){
  
        User user1 = addUser();
        user1.setUsername("neha"); //doctor
        user1.setPassword("123");
        user1.setRole("Doctor");  
        /*
        User user2 = addUser();
        user2.setUsername("arpit");
        user2.setPassword("123");
        user2.setRole("xyz");*/
    }

    public ArrayList<User> getUserDir() {
        return userDir;
    }
    
    
}
