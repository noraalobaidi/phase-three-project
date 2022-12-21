package com.nora.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.project3.dao.AdminRepo;
import com.nora.project3.entities.Admin;

@Service
public class AdminServices {

	@Autowired
	AdminRepo repo;
	
	public void addAdmin(Admin admin) {
		repo.save(admin);
	}
	
	public void updateAdmin(Admin admin) {
		repo.save(admin);
	}
	
}
