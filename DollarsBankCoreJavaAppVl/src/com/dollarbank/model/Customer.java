package com.dollarbank.model;

public class Customer {
	int customerId;
	String firstName = " ";
	String lastName = " ";
	String username = " ";
	String password = " ";
	int age;
	String sex;
	String address;
	
	private Customer(int customerId, String firstName, String lastName, String username, String password, int age,
					String sex, String address) 
	{
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	private int getCustomerId() {
		return customerId;
	}

	private void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private String getSex() {
		return sex;
	}

	private void setSex(String sex) {
		this.sex = sex;
	}

	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}
	
	
}
