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
public class UpdateController {
	

	@Autowired
	CustomerService service;
	
	@RequestMapping(value="/updateCustomer",method=RequestMethod.POST)
	public ModelAndView deleteC(@RequestParam int cust_id)
	{
		Customer newcust=new Customer();
		newcust.setCust_id(cust_id);
		ModelAndView model=null;
		
            service.updateCustomer(cust_id);
		
	
		
	
		return model;
	}

}
