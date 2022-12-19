package com.nora.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.project3.dao.UserRepo;
import com.nora.project3.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	
	public void addNewUser(User user) {
		repo.save(user);
	}

}
