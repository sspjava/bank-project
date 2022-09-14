package com.bank.management.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;

	
	public User(int id, String firstName, String lastName, String emailId, String password) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}
	
	public int getId() {
		return Id;
		
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

   
}
