package com.bank.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.management.entity.Account;
import com.bank.management.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService service;

	@GetMapping("/account")
	public Account getAccounts() {

		return service.getAccount();
	}

	@PostMapping("/rest/account")
	public String saveFlight(@RequestBody Account account) {

		boolean saved = service.saveAccount(account);

		return "SAVED";
	}


}
