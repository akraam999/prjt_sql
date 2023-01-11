package com.example.sql.Exception;


public class EmailNotFound extends RuntimeException {
    
	private String message;
	
	public EmailNotFound(String message) {
		this.message=message;
	}
	public EmailNotFound() {
		
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	
	
}
