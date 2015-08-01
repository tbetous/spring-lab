package com.tbetous.springlab.output.impl;

import org.springframework.stereotype.Component;

import com.tbetous.springlab.output.IOutputGenerator;

@Component(value="jsonOutput") // If not value, by default class name "jsonOutputGenerator"
public class JsonOutputGenerator implements IOutputGenerator {
    public void generateOutput(){
        System.out.println("Json Output Generator");
    }
}
