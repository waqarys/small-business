package com.smallbusiness.service;

import java.util.List;

import com.smallbusiness.model.Customer;


public interface CustomerService {

	void addCustomer(Customer customer);

    List<Customer> getAllCustomers();

}
