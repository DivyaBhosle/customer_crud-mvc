package com.lti.repository;

import java.util.List;

import com.lti.model.Customer;


public interface CustomerRepository {

	public Customer addCustomer(Customer c);
	public void updateCustomer(int cust_id);
	public void deleteCustomer(int cust_id);
	public Customer findUserById(int cust_id);
	public Customer findUserByEmail(String email);
	public List<Customer> findAllUsers();
}
