package com.bank.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
	@Id
    private Integer username;
    private String password;
	public Integer getUsername() {
		return username;
	}
	public void setUsername(Integer username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param username
	 * @param password
	 */
	public LoginEntity(Integer username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
