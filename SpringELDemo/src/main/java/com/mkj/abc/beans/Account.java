package com.mkj.abc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Account {

	@Value("10000")
	private int balance;
	@Value("#{account.balance > 40000 ? true : false}")
	private boolean isMinBalance;
	
	@Autowired
	private Insurance insurance;
	
	
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isMinBalance() {
		return isMinBalance;
	}
	public void setMinBalance(boolean isMinBalance) {
		this.isMinBalance = isMinBalance;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", isMinBalance=" + isMinBalance + "]";
	}
	
	
}
