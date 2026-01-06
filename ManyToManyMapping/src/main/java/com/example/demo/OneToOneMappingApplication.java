package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.UserAddress;
import com.example.demo.model.UserDetails;
import com.example.demo.service.UserService;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OneToOneMappingApplication.class, args);
//		UserService us = ctx.getBean(UserService.class);
//		
//		UserAddress uadd = new UserAddress();
//		uadd.setCity("Vizag");
//		uadd.setCountry("India");
//		uadd.setAid(345);
//		
//		UserDetails ud = new UserDetails();
//		ud.setId(432);
//		ud.setName("sunil");
//		ud.setPhone("766787");
//		ud.setUserAddress(uadd);
//		us.postToDb(ud);
	}
	//persist , merge , detach , remove 

}
