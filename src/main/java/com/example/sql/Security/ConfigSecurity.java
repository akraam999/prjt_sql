package com.example.sql.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class ConfigSecurity extends WebSecurityConfigurerAdapter{

	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable()
		.authorizeRequests().anyRequest().permitAll();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
