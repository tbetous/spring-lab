package com.tbetous.springlab.helloworld;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

/* 
 * The annotation indicate this class must be created by Spring
 * The associated String is considered as the suggested name.
 */
@Named("helloBean")
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