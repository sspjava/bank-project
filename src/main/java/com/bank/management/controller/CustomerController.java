package com.bank.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.management.entity.Customer;
import com.bank.management.service.CustomerService;

@RestController
public class CustomerController {
   
   @Autowired
	private CustomerService service;

	@GetMapping("/customer")
	public Customer getCustomer() {

		return service.getCustomer();
	}

	@PostMapping("/rest/Customer")
	public String saveCustomer(@RequestBody Customer customer) {

		boolean saved = service.saveCustomer(customer);

		return "SAVED";
	}
}
