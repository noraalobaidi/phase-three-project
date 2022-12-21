package com.nora.project3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nora.project3.entities.Product;
import com.nora.project3.entities.Purchase;
import com.nora.project3.entities.Receipt;
import com.nora.project3.services.PurchaseServices;

@RestController
public class PurchaseController {

	@Autowired
	PurchaseServices service;
	
	@GetMapping("/purchases")
	public Iterable<Purchase> getAllPurchases() {

		return service.getAllPurchases();
	}
	
	@PostMapping("/purchases/{receiptId}/{productId}")
	String addPurchase(@RequestBody Purchase purchase, @PathVariable Integer receiptId,@PathVariable Integer productId) {
		purchase.setReceipt(new Receipt(receiptId));
		purchase.setProduct(new Product(productId));
		service.addPurchase(purchase);
		return "purchase inserted successfully to receipt";
	}
	
	@GetMapping("/purchases/date/{receiptdate}")
	List<Purchase> getAllPurchasesByDate(@PathVariable String receiptdate) {
		return service.getAllPurchasesByDate(receiptdate);
	}
	
	@GetMapping("/purchases/category/{categoryid}")
	List<Purchase> getAllPurchasesByCategory(@PathVariable Integer categoryid) {
		return service.getAllPurchasesByCategory(categoryid);
	}
}
