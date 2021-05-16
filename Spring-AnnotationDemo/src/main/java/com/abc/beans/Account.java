package com.abc.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	

	@Value("${a.Number}")
	private int accId;
	@Value("${a.Name}")
	private String accountHolderName;
	@Value("${a.balance}")
	private int balance;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("medicalPolicy")
	private Policy policy;
	
	public Account() {
		
		
		super();
		System.out.println(" inside constructor");
	}
	public Account(int accId, String accountHolderName, int balance) {
		super();
		this.accId = accId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accountHolderName=" + accountHolderName + ", balance=" + balance
				+ ", address=" + address + ", policy=" + policy + "]";
	}
	
	
	public void doInit()
	{
		System.out.println(" inside doInit");
	}
	public void doEnd()
	{
		System.out.println("inside doEnd");
	}
	
	
	
	

	
	
	
	

}
