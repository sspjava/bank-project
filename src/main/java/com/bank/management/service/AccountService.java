package com.bank.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.management.entity.Account;
import com.bank.management.repository.AccountRepo;

@Service
public class AccountService {
@Autowired
AccountRepo accountRepo;
	public boolean saveAccount(Account account) {
		Account entity = new Account();
		entity.setAccountId(account.getAccountId());
		entity.setAccountName(account.getAccountName());
		entity.setAccountNumber(account.getAccountNumber());
		entity.setAccountType(account.getAccountType());
		entity.setAccountBalance(account.getAccountBalance());
		entity.setCustomerId(account.getCustomerId());
		accountRepo.save(entity);
		return true;
	}

	public Account getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
