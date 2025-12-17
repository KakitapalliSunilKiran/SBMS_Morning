package com.example.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

//Array
//Strings
//Collection framework
//Stack
//Queue
//Linked list
//Tree
//Graph
//Backtracking
//Dynamicprogramming

@Component
@Scope("prototype")
public class DieselEngine {
   DieselEngine(){
	   System.out.println("We are in Diesel Engine Constructor"+this.hashCode());
   }
   
   public void startDieselEngine() {
	   System.out.println("Start the Diesel Engine");
   }
//   @PostConstruct
//   public void init() {
//	   System.out.println("Diesel engine hashcode"+this.hashCode());
//   }
}
