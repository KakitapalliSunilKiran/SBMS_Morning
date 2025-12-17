package com.example.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine1 {
	
	public void startEngine() {
		System.out.println("I am in Diesel Engine started");
	}

}
