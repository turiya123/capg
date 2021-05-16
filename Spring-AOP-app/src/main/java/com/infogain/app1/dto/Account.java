package com.infogain.app1.dto;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private int accountId;
	private String username;
	private int pin;
	private int balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountId, String username, int pin, int balance) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.pin = pin;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", pin=" + pin + ", balance=" + balance
				+ "]";
	}

	
	
}
