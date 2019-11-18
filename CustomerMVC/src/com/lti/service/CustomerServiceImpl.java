package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Customer;
import com.lti.repository.CustomerRepository;

@Service("cservice")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository repository;
	@Override
	
	@Transactional
	public Customer addCustomer(Customer c) {
		
		return repository.addCustomer(c);
		
		
	}

	@Transactional
	@Override
	public void updateCustomer(int cust_id) {
		// TODO Auto-generated method stub
		repository.updateCustomer(cust_id);
	}
   @Transactional
	@Override
	public void deleteCustomer(int cust_id) {
		// TODO Auto-generated method stub
	repository.deleteCustomer(cust_id);
	}

	@Override
	public Customer findUserById(Customer u) {
		return repository.findUserById(u.getCust_id());
	}

	@Override
	public List<Customer> findAllUsers() {
		List<Customer> list=repository.findAllUsers();
		return list;
	}
	
	

}
