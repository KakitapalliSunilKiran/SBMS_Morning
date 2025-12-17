package com.example.demo;

//import org.apache.catalina.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import sunilprog.sbms.Engine;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo","sunilprog.sbms"})
public class SpringBootIdeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootIdeApplication.class, args);
		System.out.println(ctx.getClass().getName());

		Engine eng = ctx.getBean(Engine.class);
		System.out.println(eng.hashCode());
		
		Engine eng1 = ctx.getBean(Engine.class);
		System.out.println(eng1.hashCode());
		
	}

}
