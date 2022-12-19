package com.nora.project3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String first_name;
	private String last_name;
	private String password;
	private String email;
	
	public User(int user_id, String first_name, String last_name, String password, String email) {

		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.email = email;
	}
	public User() {

	}
	public int getUser_id() {
		return user_id;
	}
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	

}
