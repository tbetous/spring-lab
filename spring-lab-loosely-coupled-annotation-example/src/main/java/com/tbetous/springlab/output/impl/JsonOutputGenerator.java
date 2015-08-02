package com.tbetous.springlab.output.impl;

import javax.inject.Named;

import org.springframework.stereotype.Component;

import com.tbetous.springlab.output.IOutputGenerator;

@Named
@JsonOutputGeneratorQualifier
public class JsonOutputGenerator implements IOutputGenerator {
    public void generateOutput(){
        System.out.println("Json Output Generator");
    }
}
