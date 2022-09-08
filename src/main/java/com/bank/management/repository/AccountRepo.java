package com.bank.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.management.entity.Account;

public interface AccountRepo extends CrudRepository<Account, Integer>{

}
