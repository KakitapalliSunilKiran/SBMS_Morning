package com.example.threelayers.exceptions;

import java.time.LocalDateTime;

public class ExceptionDao {
	
	int statusCode;
	String message;
	LocalDateTime lt;
	
	
	public ExceptionDao(){}
	public ExceptionDao(int statusCode, String message, LocalDateTime lt) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.lt = lt;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getLt() {
		return lt;
	}
	public void setLt(LocalDateTime lt) {
		this.lt = lt;
	}
	

}
