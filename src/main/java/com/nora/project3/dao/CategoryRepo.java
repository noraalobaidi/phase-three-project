package com.nora.project3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nora.project3.entities.Category;


@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
