package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootScopesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootScopesApplication.class, args);
//		DieselEngine de1 = ctx.getBean(DieselEngine.class);
//		System.out.println(de1.hashCode());
//		
//		DieselEngine de2 = ctx.getBean(DieselEngine.class);
//		System.out.println(de2.hashCode());
//		ctrl+shif+o
//      
//		PetrolEngine pe1 = ctx.getBean(PetrolEngine.class);
//		System.out.println(pe1.hashCode());
//		
//		PetrolEngine pe2 = ctx.getBean(PetrolEngine.class);
//		System.out.println(pe1.hashCode());
		             
		
	}

}
