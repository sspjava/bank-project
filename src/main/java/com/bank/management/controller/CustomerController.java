package com.bank.management.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.management.entity.Account;
import com.bank.management.entity.User;
import com.bank.management.service.CustomerService;

@RestController
public class CustomerController {
   
   @Autowired
	private CustomerService service;
   @GetMapping("/user")
	public List<User> getUser() {
return service.getAllUser();
		
	}
   

	@PostMapping("/rest/customer")
	public String saveUser(@RequestBody User user) {

		boolean saved = service.saveUser(user);

		return "SAVED";
	}
}
