package com.nora.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.project3.entities.Category;
import com.nora.project3.entities.Product;
import com.nora.project3.services.ProductServices;

@RestController
public class ProductControllers {

	@Autowired
	ProductServices service;
	
	@GetMapping("/products")
	public Iterable<Product> getAllProducts() {

		return service.getAllProducts();
	}
	
	@PostMapping("/products/{categoryId}")
	String addNewPlace(@RequestBody Product product, @PathVariable Integer categoryId) {
		product.setCategory(new Category(categoryId,""));
		service.addNewProduct(product);
		return "Product inserted successfully";
	}
	
//	@PutMapping("/products/category/{newCategoryId}")
//	String updateCategoryOfProduct(@RequestBody Product product, @PathVariable Integer newCategoryId) {
//		product.setCategory(new Category(newCategoryId,""));
//		service.updateProduct(product);
//		return "update category of product";
//	}
	
	@PutMapping("/products/{categoryId}")
	String updateProduct(@RequestBody Product product, @PathVariable Integer categoryId) {
		product.setCategory(new Category(categoryId,""));
		service.updateProduct(product);
		return "product updated successfully";
	}
	
	@DeleteMapping("/products/{productId}")
	String deleteProductById(@PathVariable Integer productId) {
		service.deleteProductById(productId);
		return "Product deleted successfully";
	}
}
