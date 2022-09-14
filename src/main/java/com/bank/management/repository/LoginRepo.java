package com.bank.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.management.entity.LoginEntity;


public interface LoginRepo extends JpaRepository<LoginEntity, Integer>{
	LoginEntity findByUsernameAndPassword(Integer username, String password);
}
