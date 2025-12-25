package com.example.threelayers.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandling {
	
	@ExceptionHandler(RecordNotFound.class)
	public ResponseEntity<ExceptionDao> getExceptionMessage(RecordNotFound rf) {
		
		ExceptionDao exdao = new ExceptionDao(404,rf.getMessage(),LocalDateTime.now());
		return new ResponseEntity<>(exdao, HttpStatus.NOT_FOUND);
	}
	
	

}
