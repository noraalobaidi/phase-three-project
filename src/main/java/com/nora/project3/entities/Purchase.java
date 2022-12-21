package com.nora.project3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int purchase_id;
	
	private int qty;
	@ManyToOne
	private Receipt receipt;
	@OneToOne
	private Product product;
	
	public Purchase() {
	}
	public Purchase(int purchase_id,int qty, int receiptid, int productid,int userid) {

		this.purchase_id = purchase_id;
		this.qty = qty;
		this.receipt = new Receipt(receiptid);
		this.product = new Product(productid);
	}
	public int getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
	
	
	
}