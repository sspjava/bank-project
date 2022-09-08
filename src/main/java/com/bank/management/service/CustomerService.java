package com.bank.management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.management.entity.Customer;
import com.bank.management.repository.AccountRepo;
import com.bank.management.repository.CustomerRepo;


@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	AccountRepo accountRepo;

	public boolean saveCustomer(Customer customer) {
       Customer entity = new Customer();
       entity.setCustomerId(customer.getCustomerId());
       entity.setFirstName(customer.getFirstName());
       entity.setLastName(customer.getLastName());
       entity.setEmailId(customer.getEmailId());
       entity.setPassword(customer.getPassword());
       customerRepo.save(entity);
		return true;
	}


	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getcustomerDetails(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
