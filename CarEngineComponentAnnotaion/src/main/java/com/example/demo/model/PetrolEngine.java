package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("p")
public class PetrolEngine implements Engine{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
		System.out.println("I am in PetrolEngine");
		
	}

}
