package com.example.poul.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllUser {
	@GetMapping("/home")
	public void HomePage() {
		
	}
	
	@PostMapping("/signup")
	public void UserSignup() {
		
	}
	
	@PostMapping("/login")
	public void UserLogin() {
		
	}
	
	

}
