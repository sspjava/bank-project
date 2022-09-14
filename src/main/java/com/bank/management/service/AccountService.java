package com.bank.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.management.entity.Account;
import com.bank.management.entity.User;
import com.bank.management.repository.AccountRepo;
import com.bank.management.repository.CustomerRepo;

@Service
public class AccountService {
@Autowired
private AccountRepo accountRepo;

@Autowired
private CustomerRepo customerRepo;

	public List<Account> getAllAccount() {
			Iterable<Account> accountList = accountRepo.findAll();
			List<Account> list = new ArrayList<>();
			for(Account entity : accountList) {
				Account account = new Account();
				account.setAccountId(entity.getAccountId());
				account.setAccountName(entity.getAccountName());
				account.setAccountNumber(entity.getAccountNumber());
				account.setAccountBalance(entity.getAccountBalance());
				account.setAccountType(entity.getAccountType());
				account.setUid(entity.getUid());
				list.add(account);
			}
			return list;
		}
   
	public String saveAccount(Account account) {
		Account entity = new Account();
		entity.setAccountId(account.getAccountId());
		entity.setAccountName(account.getAccountName());
		entity.setAccountNumber(account.getAccountNumber());
		entity.setAccountType(account.getAccountType());
		entity.setAccountBalance(account.getAccountBalance());
		entity.setUid(account.getUid());
		
		accountRepo.save(entity);
	return "Saved";
		}
}
