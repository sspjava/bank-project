package com.bank.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.management.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
