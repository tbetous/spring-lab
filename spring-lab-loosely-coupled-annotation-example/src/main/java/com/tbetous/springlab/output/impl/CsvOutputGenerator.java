package com.tbetous.springlab.output.impl;

import javax.inject.Named;

import com.tbetous.springlab.output.IOutputGenerator;

@Named
@CsvOutputGeneratorQualifier
public class CsvOutputGenerator implements IOutputGenerator {
    public void generateOutput(){
        System.out.println("Csv Output Generator");
    }
}
