package com.example.threelayers.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import java.util.function.Predicate;
import jakarta.persistence.criteria.Predicate;  // ✅ CORRECT

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.threelayers.model.Student;
import com.example.threelayers.repo.RepoInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Service
public class BusinessLayer {
	
	@Autowired
	RepoInfo ri;
	
	@Autowired
	EntityManager entityManager;
	
	public List<Student> getStudentsByNameCriteria(String name,String clgName) {
//	    CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//	    CriteriaQuery<Student> cq = cb.createQuery(Student.class);
//	    Root<Student> root = cq.from(Student.class);
//	    cq.select(root).where(cb.equal(root.get("name"), name));
//	    return entityManager.createQuery(cq).getResultList();
		 CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		 CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		 Root<Student> root = cq.from(Student.class);
		 List<Predicate> predicates = new ArrayList<>();
	
		//Predicate
		    if (name != null) {
		        predicates.add(cb.equal(root.get("name"), name));
		    }

		    if (clgName != null) {
		        predicates.add(cb.equal(root.get("clgName"), clgName));
		    }

		    cq.where(cb.and(predicates.toArray(new Predicate[0])));

		    return entityManager.createQuery(cq).getResultList();
	}
	
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
     
     public List<Student> findByEmail(String email) {
    	 return ri.findByEmail(email);
     }
     
     public List<Student> findByEmailNative(String email) {
    	 return ri.findByEmailNative(email);
     }
     
     public List<Student> findByEmailExample(String email) {
//    	 Student student = new Student();
//    	 student.setEmail("sunil@gmail.com");
//    	 Example<Student> example = Example.of(student);
//    	 List<Student> students = ri.findAll(example);
    	 
    	 Sort obj=Sort.by("name").and(Sort.by("lname"));
    	 List<Student> students = ri.findAll(obj);
    	 return students;
     }
     
     public List<Student> findByEmailPaging(Integer no,Integer size) {
    	 Pageable pageable = PageRequest.of(no, size);
    	 Page<Student> page = ri.findAll(pageable);
    	 return page.getContent();
     }
     
     public List<Student> findByEmailAndLname(String email,String lname) {
    	 return ri.findByEmailAndLname(email,lname);
     }
     
     public void updateClgName(String newclg, String oldClg) {
    	 ri.updateClgName("Arts clg", "Alpaha clg");
     }
     
     
     //getmethod
     //update the row
     //save method
}
