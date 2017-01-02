package com.smallbusiness.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smallbusiness.model.Customer;
import com.smallbusiness.service.CustomerDao;
import com.smallbusiness.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerDao customerDao;
	
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

}
