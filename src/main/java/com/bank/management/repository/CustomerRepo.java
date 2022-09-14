package com.bank.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.management.entity.User;

public interface CustomerRepo extends CrudRepository<User, Integer>{

}
