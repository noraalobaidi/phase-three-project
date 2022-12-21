package com.nora.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.project3.dao.CategoryRepo;
import com.nora.project3.entities.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo repo;
	
	public Iterable<Category> getAllCategories () {
		return repo.findAll();
	}
	
	public Category addNewCategory (Category category) {
		return repo.save(category);
	}

	public void updateCategory( Category category) {
		repo.save(category);
	}
	
}
