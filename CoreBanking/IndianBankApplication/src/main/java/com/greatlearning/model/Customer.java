package com.greatlearning.model;

public class Customer {  // POJO Class

	private String custAccountNumber;

	private String custPassword;

	public Customer(String custAccountNumber, String custPassword) {
		super();
		this.custAccountNumber = custAccountNumber;
		this.custPassword = custPassword;
	}

	public String getCustAccountNumber() {
		return custAccountNumber;
	}

	public void setCustAccountNumber(String custAccountNumber) {
		this.custAccountNumber = custAccountNumber;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

}
