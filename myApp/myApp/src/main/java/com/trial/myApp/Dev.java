package com.trial.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //field injection
    @Autowired
    @Qualifier("desktop")//class name with first letter in lower case
    private Computer com ;

    //constructor injection
//    Dev(Laptop l){
//        lap = l;
//    }

//    @Autowired
//    public void setLaptop(Laptop lap){
//        this.lap=lap;
//    }
    public void build(){
        com.compile();
        System.out.println("working on a project");
    }
}
