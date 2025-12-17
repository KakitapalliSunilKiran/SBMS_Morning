package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component("d")
public class DieselEngine implements Engine{

	public void startEngine() {
		System.out.println("I am in Diesel Engine");
	}
}
