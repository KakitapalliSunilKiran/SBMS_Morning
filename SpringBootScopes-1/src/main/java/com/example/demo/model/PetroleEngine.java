package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class PetroleEngine implements Engine1{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("I am in Petrol Engine");
	}

}
