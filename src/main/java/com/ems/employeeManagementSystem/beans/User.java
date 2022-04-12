package com.ems.employeeManagementSystem.beans;

import javax.persistence.Entity;
import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class User {
	
//	@Id
//	@GeneratedValue
	private int userId;
	private String password;
	private String role;
	private int result;
	
	public User() {}
	
	public User(String password, String role, int result) {
		super();
		this.password = password;
		this.role = role;
		this.result = result;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + ", result=" + result + "]";
	}

	
	
	
	

}
