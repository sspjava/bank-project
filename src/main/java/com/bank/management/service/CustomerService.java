package com.bank.management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.management.entity.Account;
import com.bank.management.entity.User;
import com.bank.management.repository.AccountRepo;
import com.bank.management.repository.CustomerRepo;


@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	AccountRepo accountRepo;

	public boolean saveUser(User customer) {
       User entity = new User();
       entity.setId(customer.getId());
       entity.setFirstName(customer.getFirstName());
       entity.setLastName(customer.getLastName());
       entity.setEmailId(customer.getEmailId());
       entity.setPassword(customer.getPassword());
       customerRepo.save(entity);
		return true;
	}



	public List<User> getAllUser() {
		Iterable<User> userList = customerRepo.findAll();
		List<User> list = new ArrayList<>();
		for(User entity : userList) {
			User user = new User();
			user.setId(entity.getId());
			user.setFirstName(entity.getFirstName());
			user.setLastName(entity.getLastName());
			user.setEmailId(entity.getEmailId());
			user.setPassword(entity.getPassword());
			 list.add(user);
		}
		return list;
	}

}
