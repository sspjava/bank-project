package com.bank.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.management.entity.Account;
import com.bank.management.service.AccountService;
import com.bank.management.service.CustomerService;

@Controller
public class AccountUIController {
	@Autowired
    private AccountService service;

	@Autowired
    private CustomerService services;
	
	@PostMapping("/dashboard")
    public String saveAccount(@ModelAttribute("account") Account account) {
        this.service.saveAccount(account);
        return "saved";
    }
	 @GetMapping("/index")
	    public String getLandingIndexPage(){
	        return "index";
	    }
	 @GetMapping("/register")
	    public String registerUser() {
	        return "register";
	    }
	@GetMapping("/login")
    public String goToLogin() {

        return "login";
    }
	
    @GetMapping("/")
    public String getLandingPage(){
        return "index";
    }

   

}
