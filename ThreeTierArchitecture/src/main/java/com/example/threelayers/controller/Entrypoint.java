package com.example.threelayers.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.threelayers.exceptions.RecordNotFound;
import com.example.threelayers.model.Student;
import com.example.threelayers.service.BusinessLayer;

@RestController
public class Entrypoint {
	
	//There are 4 Http Methods 
	//@GetMapping
	//@PostMapping
	//@PutMapping
	//@deleteMapping
	//localhost:8080/greet
	
	@Autowired
	BusinessLayer businessLayer;
	
//	@PostMapping("/store")
//	public void storeToDb(@RequestBody Student s) {
//		 businessLayer.storeToDb(s);
//	}
	
	@PostMapping("/store")
	public ResponseEntity<Student> storeToDb(@RequestBody Student s) {
	    Student savedStudent = businessLayer.storeToDb(s);
	    return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
	}
	
//	@GetMapping("/fetch/{id}")
//	public Optional<Student> getStudent(@PathVariable("id") int id) {
//		return businessLayer.getStudent(id);
//	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) throws RecordNotFound {

	    Optional<Student> student = businessLayer.getStudent(id);

	    if (student.isPresent()) {
	        return ResponseEntity.ok(student.get());   // 200 OK
	    } else {
	       throw new RecordNotFound("please give valid id..id not found"+id); // 404 Not Found
	    }
	}
	
//	@PutMapping("update/{id}/{clgName}")
//	public void updateStudent(@PathVariable("id") int id,@PathVariable("clgName") String clgName) {
//		businessLayer.updateStudent(id, clgName);
//	}
	
	@PutMapping("/update/{id}/{clgName}")
	public ResponseEntity<String> updateStudent(
	        @PathVariable int id,
	        @PathVariable String clgName) {

	    boolean updated = businessLayer.updateStudent(id, clgName);

	    if (updated) {
	        return ResponseEntity.ok("Student updated successfully"); // 200 OK
	    } else {
	        return ResponseEntity.notFound().build(); // 404
	    }
	}
	
//	@DeleteMapping("delete/{id}")
//	public void deleteMapping(@PathVariable("id") int id) {
//		businessLayer.deleteMapping(id);
//	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteMapping(@PathVariable int id) {

	    boolean deleted = businessLayer.deleteMapping(id);

	    if (deleted) {
	        return ResponseEntity.noContent().build(); // 204 No Content
	    } else {
	        return ResponseEntity.notFound().build();  // 404 Not Found
	    }
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
