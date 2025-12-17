package com.example.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
    Car(){
    	System.out.println("I am in cer class construtor");
    }
    
    public void startCar() {
    	System.out.println("I am starting the car");
    }
}
