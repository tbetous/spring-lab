package com.tbetous.springlab.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tbetous.springlab.helloworld.HelloWorld;

public class App {

    public static void main(String[] args) {
        
        // Create the spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-module.xml");
        
        // Get my HelloWorld bean from the Spring context
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        
        // Hello + name configured
        obj.printHello();
    }

}
