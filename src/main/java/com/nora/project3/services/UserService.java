package com.nora.project3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.project3.dao.UserRepo;
import com.nora.project3.entities.Purchase;
import com.nora.project3.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	
	public void addNewUser(User user) {
		repo.save(user);
	}
	
	public Iterable<User> getAllUsers() {
		return repo.findAll();
	}
	
	public List<User> findUserByEmail(String email){
		return repo.findByEmail(email);
	}
	
	public Optional<User> findUserById(Integer id){
		return repo.findById(id);
	}

}
