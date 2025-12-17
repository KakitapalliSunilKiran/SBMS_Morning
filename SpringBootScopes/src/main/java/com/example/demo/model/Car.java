package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Car {
  @Autowired
  DieselEngine de;
  Car(){
	  System.out.println("I am in car class comstrcutor");
	  System.out.println("Car object class hascode is"+this.hashCode());
   }
  
  @PostConstruct
  public void init678() {
	  System.out.println("de hashcode in Car object class hascode is"+de.hashCode());
	  de.startDieselEngine();
  }
  
  @PreDestroy
  public void dest678() {
	  System.out.println("Car object has been destroyed");
  }
  
  
}
