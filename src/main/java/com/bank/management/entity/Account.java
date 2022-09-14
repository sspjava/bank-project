package com.bank.management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	 @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	 private int accountId;
	 private String accountNumber;
	 private String accountName;
	 private String accountType;
	 private long accountBalance;
	 @OneToOne(cascade= {CascadeType.ALL})
	 @JoinColumn(name = "user_id")
	 private User uid ;
	 
	public User getUid() {
		return uid;
	}
	
	public Account(User uid) {
		super();
		this.uid = uid;
	}
	public void setUid(User uid) {
		this.uid = uid;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
	public Account(int accountId, String accountNumber, String accountName, String accountType, long accountBalance,
			User customerId) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	 
}
