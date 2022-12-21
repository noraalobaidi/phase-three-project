package com.nora.project3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nora.project3.entities.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{

}
