package com.tbetous.springlab.helloworld;

public class HelloWorld {
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