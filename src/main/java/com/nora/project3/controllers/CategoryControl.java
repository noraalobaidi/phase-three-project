package com.nora.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.project3.entities.Category;
import com.nora.project3.services.CategoryService;

@RestController
public class CategoryControl {
	
	@Autowired
	CategoryService service;
	
	@GetMapping("/categories")
	Iterable<Category> getAllCategories() {
		return service.getAllCategories();
	}
	
	@PostMapping("/categories")
	Category addNewCategory( @RequestBody Category category)
	{
		return service.addNewCategory(category);
	}
	
	@PutMapping("/categories")
	public String updateCategory(@RequestBody Category category) {
		service.updateCategory(category);
		return "Category updated successfully";
	}


}
