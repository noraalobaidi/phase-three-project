package com.nora.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.project3.dao.ReceiptRepo;
import com.nora.project3.entities.Receipt;

@Service
public class ReceiptServices {

	@Autowired
	ReceiptRepo repo;
	
	public Receipt AddReceipt(Receipt receipt) {
		return repo.save(receipt);
	}
	
public Iterable<Receipt> getAllReceipts () {
	return repo.findAll();
}
	
	
}
