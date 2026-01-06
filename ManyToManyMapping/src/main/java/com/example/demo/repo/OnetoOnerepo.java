package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserDetails;

public interface OnetoOnerepo extends JpaRepository<UserDetails,Integer>{

}
