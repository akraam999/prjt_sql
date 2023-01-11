package com.example.sql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.sql.Client.Client;
import com.example.sql.Repository.UserRepository;

@Service
public class UserService {
    
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository rep;
	
	public List<Client> getAll() {
		List<Client> all_client = rep.findAll();
		return all_client;
	}
	public Client add_client(Client client) {
		client.setPassword(passwordEncoder.encode(client.getPassword()));
		return rep.save(client);
	}
}
