package com.nora.project3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nora.project3.entities.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer>{

}
