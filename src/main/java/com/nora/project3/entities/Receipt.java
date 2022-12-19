package com.nora.project3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Receipt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int receipt_id;
	
	private String date;
	@ManyToOne
	private User user;
	
	public Receipt() {
	}
	public Receipt(int receipt_id,String date, int userid) {

		this.receipt_id=receipt_id;
		this.date = date;
		this.user = new User(userid,"","","","");

	}
	public int getReceipt_id() {
		return receipt_id;
	}
	public void setReceipt_id(int receipt_id) {
		this.receipt_id = receipt_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
}