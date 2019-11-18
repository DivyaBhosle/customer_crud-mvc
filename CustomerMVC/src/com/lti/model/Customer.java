package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customermvc")
public class Customer {
	
	@Id @GeneratedValue()
	int cust_id;
    String name;
    String address;
    public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cust_id, String name, String address, String email, int contact) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	String email;
    int contact;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
}
