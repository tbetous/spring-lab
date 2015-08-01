package com.tbetous.springlab.output.impl;

import org.springframework.stereotype.Component;

import com.tbetous.springlab.output.IOutputGenerator;

@Component(value="csvOutput") // If not value, by default class name "csvOutputGenerator"
public class CsvOutputGenerator implements IOutputGenerator {
    public void generateOutput(){
        System.out.println("Csv Output Generator");
    }
}
