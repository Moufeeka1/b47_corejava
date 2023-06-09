package com.tnsif.programs;
//Program to demonstrate constructor getters and setters
public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
public Customer() {
	}
//Parameterized Constructors	
	public Customer(String customerName, int customerId, String customerCity) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}
