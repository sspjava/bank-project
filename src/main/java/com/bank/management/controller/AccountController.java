package com.bank.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.management.entity.Account;
import com.bank.management.service.AccountService;


@RestController
//@RequestMapping("/account/")
public class AccountController {
	@Autowired
	private AccountService service;

@GetMapping("/account")
	public List<Account> getAccount() {
return service.getAllAccount();
		
	}


	@PostMapping("/account/post")
	public String saveAccount(@RequestBody Account account) {
    String saved = service.saveAccount(account);
    return "SAVED";
	}


}
