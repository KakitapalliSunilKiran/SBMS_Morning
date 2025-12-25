package com.example.threelayers.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.threelayers.model.Student;

import jakarta.transaction.Transactional;

public interface RepoInfo extends JpaRepository<Student,Integer>
{
//	List<Student> findByEmail(String email);
	@Query("SELECT s FROM Student s WHERE s.email = :email")
	List<Student> findByEmail(@Param("email") String email);
	
	@Query("SELECT s FROM Student s WHERE s.email = :email AND s.lname = :lname")
	List<Student> findByEmailAndLname(@Param("email") String email,
	                                  @Param("lname") String lname);
	
	    @Modifying
	    @Transactional
	    @Query("UPDATE Student s SET s.clgName = :newclgName WHERE s.clgName = :oldClgname")
	    int updateClgName(@Param("newclgName") String newclgName, @Param("oldClgname") String oldClgname);
	    
	    
	    @Query(
	    	    value = "SELECT * FROM student WHERE email = :email",
	    	    nativeQuery = true
	    	)
	    	List<Student> findByEmailNative(@Param("email") String email);
	
	
//	List<Student> findByEmailAndLname(String email,String fname);
	
	
}
//class Abc implements RepoInfo
//{
//	//all those 13 methos
//}
//proxy design 
//strategy design pattern 

