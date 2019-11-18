package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Customer;
import com.lti.service.CustomerService;

@Controller
public class AddController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public ModelAndView add(@RequestParam String name,String address,String email,int contact)
	{
		Customer newcust=new Customer();
	
		newcust.setName(name);
		newcust.setAddress(address);
		newcust.setEmail(email);
		newcust.setContact(contact);
		
		Customer c=service.addCustomer(newcust);
		
		ModelAndView model=null;
		if(c==null)
		{
			System.out.println("Customer added");
		}
		else
		{
			model=new ModelAndView("customeradded");
			model.addObject("Customer", c);
		}
	
		return model;
	}
	

	
	

}
