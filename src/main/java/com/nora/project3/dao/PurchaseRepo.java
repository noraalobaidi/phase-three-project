package com.nora.project3.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nora.project3.entities.Purchase;

@Repository
public interface PurchaseRepo extends CrudRepository<Purchase, Integer> {

	List<Purchase> findByReceiptDate(String receiptDate);
	List<Purchase> findByProductCategoryCategoryid(Integer categoryid);
	
}
