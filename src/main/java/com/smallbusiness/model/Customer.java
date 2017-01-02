package com.smallbusiness.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int customerId;
	
	@NotEmpty(message = "The customer name must not be null")
	private String name;
	
	@NotEmpty (message = "The customer email must not be null")
	private String email;
	
	@NotEmpty (message = "The customer phone must not be null")
	private String phoneNumber;
	
	@NotEmpty (message = "Message must not be null")
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
