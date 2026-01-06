package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserAddress;
import com.example.demo.model.UserDetails;
import com.example.demo.repo.OnetoOneAdd;
import com.example.demo.repo.OnetoOnerepo;

@Service
public class UserService {
	
	@Autowired
	OnetoOnerepo one;
	
	@Autowired
	OnetoOneAdd add;
	
	public void postToDb(UserDetails ud) {
		UserAddress address = ud.getUserAddress();

        if (address != null) {
            address.setUserDetails(ud);
        }
		one.save(ud);
	}
	
	public void postToDbadd(UserAddress ua) {
	
		add.save(ua);
	}
	
	public void deleteOperation(int id) {
		one.deleteById(id);
	}
	
	public Optional<UserDetails> getById(int id) {
		return one.findById(id);
	}
	
	public Optional<UserAddress> getById1(int id) {
		return add.findById(id);
	}


}
//userdetails user_address_aid ,user_address_street

//userAddress 
