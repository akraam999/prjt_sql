package com.example.sql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sql.Client.Client;
import com.example.sql.Service.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService service;
	
	
	@PostMapping("/add_client")
	public ResponseEntity<?> add_user(@RequestBody Client client){
		return new ResponseEntity<>(service.add_client(client),HttpStatus.ACCEPTED);
	}
	@GetMapping("/all_client")
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.ACCEPTED);
		
	}
}
