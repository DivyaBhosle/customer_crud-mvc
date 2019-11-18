package com.lti.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Customer;


@Repository("crepository")
public class CustomerRepositoryImpl implements CustomerRepository{

	@PersistenceContext
	EntityManager em;
	@Override
	public Customer addCustomer(Customer c) {

		em.persist(c);
		return c;
		
	}

	@Override
	public void updateCustomer(int cust_id) {
		Customer c=em.find(Customer.class,cust_id);
		c= em.merge(c);
		c.setAddress("Koparkairne");
		
	}

	@Override
	public void deleteCustomer(int cust_id) {
		Customer c=em.find(Customer.class,cust_id);
		em.merge(c);
		em.remove(c);
		
	}

	@Override
	public Customer findUserById(int cust_id) {

		System.out.println("\n\n--Done with where clause with parameters");
		String q="Select c from Customer c where u.cust_id= ?1";
		javax.persistence.TypedQuery<Customer> query=em.createQuery(q,Customer.class);
		query.setParameter(1,cust_id);
		Customer c=query.getSingleResult();
		
		return c;
	}

	@Override
	public Customer findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
