package com.tbetous.springlab.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* 
 * The annotation indicate this class is a spring componant
 * The associated String is considered as the suggested name.
 */
@Component("helloBean")
public class HelloWorld {
    
    // When the bean is create, the name will take the value set by the placeholder (see spring-module.xml)
    @Value("${name}")
    private String name;    

    public void init() {
        System.out.println("HelloWorld bean created !");
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}