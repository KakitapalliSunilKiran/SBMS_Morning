package com.example.threelayers.exceptions;

public class RecordNotFound extends Exception{
	private String messgae;
	public RecordNotFound(String str){
		super(str);
		//this.messgae=str;
	}
}

//difference between checked and unchecked exception
//child of exception
//child of runtimeexception
