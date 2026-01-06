package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class UserAddress {
    @Id
	private Integer aid;
	private String city;
	private String country;
	
	@ManyToMany(mappedBy="userAddress")
	List<UserDetails> list=new ArrayList<>();
	
//	@ManyToOne
//	@JoinColumn(name="user_id",referencedColumnName="id")
//	private UserDetails userDetails;

	
//	@OneToOne(mappedBy="userAddress")
//	@JsonBackReference
//	private UserDetails userDetails;

	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
