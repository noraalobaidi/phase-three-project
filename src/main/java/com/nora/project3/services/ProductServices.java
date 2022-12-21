package com.nora.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nora.project3.dao.ProductRepo;
import com.nora.project3.entities.Category;
import com.nora.project3.entities.Product;

@Service
public class ProductServices {
	
	@Autowired
	ProductRepo repo;
	
	public Iterable<Product> getAllProducts() {
		return repo.findAll();
	}
	
	public Product addNewProduct (Product product) {
		return repo.save(product);
	}

	public Product updateProduct (Product product) {
		return repo.save(product);
	}
	public void deleteProductById(Integer productId) {
		repo.deleteById(productId);
	}

}
