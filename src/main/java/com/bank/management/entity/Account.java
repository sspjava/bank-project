package com.bank.management.entity;

import javax.persistence.Entity;
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
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int accountId;
	 private String accountNumber;
	 private String accountName;
	 private String accountType;
	 private long accountBalance;
	 @OneToOne
	 @JoinColumn(name = "customer_id")
	 private Customer customerId;
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
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @param accountId
	 * @param accountNumber
	 * @param accountName
	 * @param accountType
	 * @param accountBalance
	 * @param customerId
	 */
	public Account(int accountId, String accountNumber, String accountName, String accountType, long accountBalance,
			Customer customerId) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.customerId = customerId;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	 
}
