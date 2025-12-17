package com.example.threelayers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//Where is the Data source is  configure
@Entity
public class Student {
	
	@Id
	int id;
	String name;
	String lname;
	String clgName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	
	
	

}
