package com.nora.project3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	private String name;
	private float price;
	@ManyToOne
	private Category category;
	
	
	public Product() {

}
	
	public Product(int product_id,  String name, float price,int categoryid) {

		super();
	this.product_id = product_id;
	this.name = name;
	this.price = price;
	
	this.category = new Category(categoryid,"");
}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	 

}
