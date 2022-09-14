package com.bank.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.bank.management.entity.Login;
import com.bank.management.entity.LoginEntity;
import com.bank.management.repository.LoginRepo;



@Service
public class LoginService {
	@Autowired
    private LoginRepo loginRepo;
	
	@GetMapping("/login")
    public String userIsValid(Login login) {
        LoginEntity loginEntity = this.loginRepo.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        if(loginEntity != null) {
            return "addpassenger";
        }
        return "error404";
    }
}
