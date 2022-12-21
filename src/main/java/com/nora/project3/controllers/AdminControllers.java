package com.nora.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.project3.entities.Admin;
import com.nora.project3.services.AdminServices;

@RestController
public class AdminControllers {

	@Autowired
	AdminServices service;
	
	@PostMapping("/admin")
	public void addAdmin(@RequestBody Admin admin) {
		service.addAdmin(admin);
	}
	
	@PutMapping("/admin")
	public String updateAdmin(@RequestBody Admin admin) {
		service.updateAdmin(admin);
		return "Admin Updated Successfully";
	}

}
