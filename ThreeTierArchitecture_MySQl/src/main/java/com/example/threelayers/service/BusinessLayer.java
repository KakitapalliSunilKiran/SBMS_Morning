package com.example.threelayers.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.threelayers.model.Student;
import com.example.threelayers.repo.RepoInfo;

@Service
public class BusinessLayer {
	
	@Autowired
	RepoInfo ri;
	
     public void storeToDb(Student s) { 
    	 ri.save(s);
     }
     
     public Optional<Student> getStudent(int id) {
    	 return ri.findById(id);
     }
     
     public void updateStudent(int id,String clgName) {
 		Optional<Student> s = ri.findById(id);
 		if(s.isPresent()) {
 			s.get().setClgName(clgName);
 			ri.save(s.get());
 		}
 		
 	}
     
     public void deleteMapping(int id) {
    	 ri.deleteById(id);
     }
     //getmethod
     //update the row
     //save method
}
