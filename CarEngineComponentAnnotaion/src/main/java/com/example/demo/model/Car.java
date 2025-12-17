package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	
	Engine e;
	
//	
//	@Autowired
//	public void setE(@Qualifier("d") Engine e) {
//		this.e = e;
//	}
	
	

   Car(@Qualifier("p") Engine e){
	   this.e=e;
   }

	public void startCar() {
		System.out.println("car has been started");
		e.startEngine();
	}

	
}
