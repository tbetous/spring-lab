package com.tbetous.springlab.user.service.impl;

import javax.inject.Named;

import com.tbetous.springlab.user.data.User;
import com.tbetous.springlab.user.service.UserService;

@Named 
@UserServiceImplQualifier
public class UserServiceImpl implements UserService{

    public void createUser(User user) {
        System.out.println("This function du something with a DAO to save the User in a DB ...");
    }

    public void doNothing() {
        System.out.println("This function do nothing ...");
    }
    
}
