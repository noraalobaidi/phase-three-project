package com.nora.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.project3.entities.Receipt;
import com.nora.project3.entities.User;
import com.nora.project3.services.ReceiptServices;

@RestController
public class ReceiptControllers {

	@Autowired
	ReceiptServices service;
	
	
	@GetMapping("/receipts")
	public Iterable<Receipt> getAllReceipts() {

		return service.getAllReceipts();
	}
	
	@PostMapping("/receipts/{userid}")
	String addNewPlace(@RequestBody Receipt receipt, @PathVariable Integer userid) {
		receipt.setUser(new User(userid,"","","",""));
		service.AddReceipt(receipt);
		return "Receipt inserted successfully";
	}
}
