package com.tbetous.springlab.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        
        // Create the spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring-module.xml");
        
        // Get my HelloWorld bean from the Spring context
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        
        // Hello + name configured
        obj.printHello();
    }

}
