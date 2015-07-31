package com.tbetous.springlab.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tbetous.springlab.output.OutputHelper;

public class App {

    public static void main(String[] args) {
        // Create the spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-module.xml");
        
        // Get the configured OutpuHelper from the spring-module.xml
        OutputHelper output = (OutputHelper) context.getBean("outputHelper");
        
        // Display output from the output configured
        output.generateOutput(); 
    }
}
