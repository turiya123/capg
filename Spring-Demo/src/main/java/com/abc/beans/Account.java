package com.abc.beans;

public class Account {
	

	private int accId;
	private String accountHolderName;
	private int balance;
	private Policy policy;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accId, String accountHolderName, int balance) {
		super();
		this.accId = accId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
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
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accountHolderName=" + accountHolderName + ", balance=" + balance
				+ ", policy=" + policy + "]";
	}
	
	
	
	
	

	
	
	
	

}