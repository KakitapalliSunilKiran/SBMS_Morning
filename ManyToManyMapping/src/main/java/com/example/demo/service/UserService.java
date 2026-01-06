package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;
import com.example.demo.repo.OnetoOnerepo;

@Service
public class UserService {
	
	@Autowired
	OnetoOnerepo one;
	
	public void postToDb(UserDetails ud) {
		one.save(ud);
	}
	
	public void deleteOperation(int id) {
		one.deleteById(id);
	}
	
	public Optional<UserDetails> getById(int id) {
		return one.findById(id);
	}

}
//userdetails user_address_aid ,user_address_street

//userAddress 
