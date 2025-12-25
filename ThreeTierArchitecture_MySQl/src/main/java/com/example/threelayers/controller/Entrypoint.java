package com.example.threelayers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.threelayers.model.Student;
import com.example.threelayers.service.BusinessLayer;

@RestController

//@RestController
//@Service
//@Repository
//@Component
//@SpringBootApplication
//@Autowired
//get,post , put ,delete
//@Pathvariable
//@RequestParam
//spring data jpa





public class Entrypoint {
	
	//There are 4 Http Methods 
	//@GetMapping
	//@PostMapping
	//@PutMapping
	//@deleteMapping
	//localhost:8080/greet
	
	@Autowired
	BusinessLayer businessLayer;
	
	@PostMapping("/store")
	public void storeToDb(@RequestBody Student s) {
		 businessLayer.storeToDb(s);
	}
	
	@GetMapping("/fetch/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id) {
		return businessLayer.getStudent(id);
	}
	
	@GetMapping("/fetchemail/{email}")
	public List<Student> getStudent(@PathVariable("email") String email) {
		return businessLayer.findByEmail(email);
	}
	
	@GetMapping("/fetchcriteria/{name}/{clgName}")
	public List<Student> getStudentCriteria(@PathVariable("name") String name,@PathVariable("clgName") String clgName) {
		return businessLayer.getStudentsByNameCriteria(name,clgName);
	}

	
	@GetMapping("/fetchemailnative/{email}")
	public List<Student> getStudentNative(@PathVariable("email") String email) {
		return businessLayer.findByEmailNative(email);
	}
	
	@GetMapping("/fetchemailexample/{email}")
	public List<Student> getStudentExample(@PathVariable("email") String email) {
		return businessLayer.findByEmailExample(email);
	}
	
	@GetMapping("/fetchpages/{no}/{size}")
	public List<Student> getStudentPaging(@PathVariable("no") Integer no,@PathVariable("size") Integer size) {
		return businessLayer.findByEmailPaging(no,size);
	}
	
//	@GetMapping("/fetchemailnative/{email}")
//	public List<Student> getStudentNative(@PathVariable("email") String email) {
//		return businessLayer.findByEmailNative(email);
//	}
//	
	
	
	
	@GetMapping("/fetchemailandlname/{email}/{lname}")
	public List<Student> getStudent(@PathVariable("email") String email,@PathVariable("lname") String lname) {
		return businessLayer.findByEmailAndLname(email,lname);
	}
	
	@PutMapping("/updateclg/{old}/{new}")
	public void updateclg(@PathVariable("old") String oldClg,@PathVariable("new") String newClg) {
		 businessLayer.updateClgName(oldClg,newClg);
	}
	
	
	@PutMapping("update/{id}/{clgName}")
	public void updateStudent(@PathVariable("id") int id,@PathVariable("clgName") String clgName) {
		businessLayer.updateStudent(id, clgName);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteMapping(@PathVariable("id") int id) {
		businessLayer.deleteMapping(id);
	}
	
	//post ,put , get , delete
	//ResponseEntity
	//you should incorporate status codes
	//you should throw spring boot exceptions
	//you should write junit test cases
	
	//weird i posted that on linkedin
	//20k reach
	//Use Respo
	
	//DSA and System design
	//Amazon Senior Technical role
	//DSA 
	//70 percent 
	//System design 1.32 crore
	
	//@pathvariable @RequestParam
	
	
}
