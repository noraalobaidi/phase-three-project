package com.nora.project3.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.project3.entities.User;
import com.nora.project3.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	
	
	@PostMapping("/users")
	public String addNewUser(@RequestBody User user) {
		service.addNewUser(user);
		return user.getEmail()+" added successfully";
	}
	
	@GetMapping("/users")
	public Iterable<User> getAllUsers() {

		return service.getAllUsers();
	}
	
	@GetMapping("/users/email/{email}")
	public Iterable<User> getUserByEmail(@PathVariable String email) {

		return service.findUserByEmail(email);
	}
	
	@GetMapping("/users/id/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {

		return service.findUserById(id);
	}
}
