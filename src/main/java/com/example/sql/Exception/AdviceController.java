package com.example.sql.Exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AdviceController {

	public ResponseEntity<?> EmailNotFound(EmailNotFound ex,WebRequest req){
		Map<String,Object> body= new HashMap<>();
		
		body.put("Timestamp",new Date());
		body.put("message", ex.getMessage());
		return new ResponseEntity<>(body,HttpStatus.NOT_FOUND);
	}
}
