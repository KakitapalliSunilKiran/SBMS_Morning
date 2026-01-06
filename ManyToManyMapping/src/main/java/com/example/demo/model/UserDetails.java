package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class UserDetails {
	@Id
	private Integer id;	
	private String name;
	private String email;
	private String phone;
//	
//	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
//	@JoinColumn(name="fk",referencedColumnName="id")
//	private List<UserAddress> userAddress;
//	@OneToMany(
//		    mappedBy = "userDetails",
//		    cascade = CascadeType.ALL,
//		    fetch = FetchType.LAZY
//		)
	    
	    @ManyToMany(cascade=CascadeType.ALL)
	    @JoinTable(
	        name="user_orders",
	        joinColumns=@JoinColumn(name="id"),
	        inverseJoinColumns=@JoinColumn(name="aid")
	    )
		private List<UserAddress> userAddress;


	public List<UserAddress> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<UserAddress> userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public UserAddress getUserAddress() {
//		return userAddress;
//	}
//
//	public void setUserAddress(UserAddress userAddress) {
//		this.userAddress = userAddress;
//	}
//	
	

	
	
}

