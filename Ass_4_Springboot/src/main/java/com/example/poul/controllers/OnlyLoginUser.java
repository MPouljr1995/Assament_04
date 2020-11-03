package com.example.poul.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlyLoginUser {
	
	@GetMapping("/profile")
	@PreAuthorize("hasRole('USER')  or hasRole('ADMIN')")
	public void UserProfile() {
		
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public void AdminAccess() {
		
	}
	
	@PostMapping("/addbook")
	@PreAuthorize("hasRole('USER')  or hasRole('ADMIN')")
	public void New_AddBook() {
		
	}
	
	@GetMapping("/booklist")
	@PreAuthorize("hasRole('USER')  or hasRole('ADMIN')")
	public void BookListView() {
		
	}
	
	@PostMapping("/adduser")
	@PreAuthorize("hasRole('ADMIN')")
	public void AddNewUser() {
		
	}
	
	@GetMapping("/userlist")
	@PreAuthorize("hasRole('ADMIN')")
	public void UserListView() {
		
	}

}
