package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserAddress;

public interface OnetoOneAdd  extends JpaRepository<UserAddress,Integer>{

}
