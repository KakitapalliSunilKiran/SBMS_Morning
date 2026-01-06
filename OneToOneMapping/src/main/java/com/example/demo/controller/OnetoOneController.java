package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserAddress;
import com.example.demo.model.UserDetails;
import com.example.demo.service.UserService;

@RestController
public class OnetoOneController {
	
	@Autowired
	UserService us;
	
	@PostMapping("onetoone")
	public void getOneOne(@RequestBody UserDetails ud) {
		us.postToDb(ud);
	}
	
	@PostMapping("onetooneadd")
	public void getOneOneAdd(@RequestBody UserAddress ua) {
		us.postToDbadd(ua);
	}
	
	@DeleteMapping("/delete/{id}")
	public void getDelete(@PathVariable("id") int id) {
		us.deleteOperation(id);
	}
	
	@GetMapping("fetch/{id}")
	public UserDetails getById(@PathVariable("id") int id) {
		return us.getById(id).get();
	}
	
	@GetMapping("fetch1/{id}")
	public UserAddress getById1(@PathVariable("id") int id) {
		return us.getById1(id).get();
	}
	

}
