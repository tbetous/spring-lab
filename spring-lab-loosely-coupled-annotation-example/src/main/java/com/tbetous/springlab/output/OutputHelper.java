package com.tbetous.springlab.output;

import javax.inject.Inject;
import javax.inject.Named;

import com.tbetous.springlab.output.impl.CsvOutputGeneratorQualifier;

@Named
public class OutputHelper {
    private IOutputGenerator outputGenerator;
    
    public OutputHelper() {}
    
    // I use JSR-330 to inject my output generator, note that the annotation
    // @CsvOutputGeneratorQualifier is used as qualifier.
    // Injection with constructor
    @Inject 
    public OutputHelper(@CsvOutputGeneratorQualifier IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    // Injection with property
    // @Inject
    // @CsvOutputGeneratorQualifier
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    // I can focus only on what my code do because the object are injected
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
