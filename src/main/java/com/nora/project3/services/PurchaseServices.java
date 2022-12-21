package com.nora.project3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nora.project3.dao.PurchaseRepo;
import com.nora.project3.entities.Purchase;

@Service
public class PurchaseServices {

@Autowired
PurchaseRepo repo;

public Iterable<Purchase> getAllPurchases() {
	return repo.findAll();
}

public Purchase addPurchase(Purchase purchase) {
	return repo.save(purchase);
}

public List<Purchase> getAllPurchasesByDate(String receiptDate) {
	return repo.findByReceiptDate(receiptDate);
}

public List<Purchase> getAllPurchasesByCategory(Integer categoryid) {
	return repo.findByProductCategoryCategoryid(categoryid);
}

}
