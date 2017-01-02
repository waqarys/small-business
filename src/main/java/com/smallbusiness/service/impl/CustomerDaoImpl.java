package com.smallbusiness.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smallbusiness.model.Customer;
import com.smallbusiness.service.CustomerDao;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();

        return customerList;
	}

}
