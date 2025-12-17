package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
    private  Engine1 e;
    
    
//    Car(DieselEngine e){
//    	this.e=e;
//    }
    
    @Autowired
    Car(PetroleEngine e){
    	this.e=e;
    }
    
    @Autowired
	public void setE(DieselEngine e) {
		this.e = e;
	}



	public void startCar() {
		System.out.println("Car started");
		e.startEngine();
	}
    
}
