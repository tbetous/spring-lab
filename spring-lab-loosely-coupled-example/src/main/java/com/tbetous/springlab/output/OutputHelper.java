package com.tbetous.springlab.output;

public class OutputHelper {
    
    // By using an interface my application is less coupled
    IOutputGenerator outputGenerator;
    
    // If you need not any other constructor you don't need this
    public OutputHelper() {}
    
    // Necessary if you use constructor style injection
    public OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
    
    // Necessary if you use property style injection
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    // I can focus only on what my code do because the object are injected
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
