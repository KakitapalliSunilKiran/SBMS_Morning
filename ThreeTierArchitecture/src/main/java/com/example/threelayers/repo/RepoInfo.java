package com.example.threelayers.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.threelayers.model.Student;

public interface RepoInfo extends JpaRepository<Student,Integer>
{
	
}
//class Abc implements RepoInfo
//{
//	//all those 13 methos
//}
//proxy design 

