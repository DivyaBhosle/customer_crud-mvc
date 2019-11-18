package com.lti.service;

import java.util.List;

import com.lti.model.Customer;


public interface CustomerService {
	
	public Customer addCustomer(Customer c);
	public void updateCustomer(int cust_id);
	public void deleteCustomer(int cust_id);
	public Customer findUserById(Customer u);
	public List<Customer> findAllUsers();

}
