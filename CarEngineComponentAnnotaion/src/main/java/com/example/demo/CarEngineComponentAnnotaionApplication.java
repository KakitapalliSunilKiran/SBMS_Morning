package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Car;

@SpringBootApplication
public class CarEngineComponentAnnotaionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CarEngineComponentAnnotaionApplication.class, args);
		Car c = ctx.getBean(Car.class);
		c.startCar();
	}

}
