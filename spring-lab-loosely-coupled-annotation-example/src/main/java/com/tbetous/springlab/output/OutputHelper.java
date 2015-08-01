package com.tbetous.springlab.output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OutputHelper {
    // By using an interface my application is less coupled
    @Autowired
    @Qualifier("csvOutput")
    private IOutputGenerator outputGenerator;
    
    //    Here is the setter is not necessary because the Reflection is used to set the object
    //    public void setOutputGenerator(IOutputGenerator outputGenerator) {
    //        this.outputGenerator = outputGenerator;
    //    }

    // I can focus only on what my code do because the object are injected
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
