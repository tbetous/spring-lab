package com.tbetous.springlab.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tbetous.springlab.user.data.User;
import com.tbetous.springlab.user.service.UserService;
import com.tbetous.springlab.user.service.impl.UserServiceImplQualifier;

public class App {
    public static void main(String[] args) {
        // Create the spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-module.xml");
        
        // Get user service bean
        UserService userService = (UserService) context.getBean("userServiceImpl");
        
        // Create a user
        User user = new User("Thomas");
        
        // Should display "The user Thomas has been created !" after execution
        userService.createUser(user);
        
        // Should display "You know nothing notifier !" after execution
        userService.doNothing();
    }
}
