package com.infogain.app1.service;

import org.springframework.stereotype.Component;

import com.infogain.app1.dto.Account;

@Component
public class AccountService {
	
	public void accountTask()
	{
		System.out.println("Account task called ...");
	}

		
	public Account doDeposit(Account account,int amount)
	{
		System.out.println(" Account Deposit() Called ");
		account.setBalance(account.getBalance()+amount);
		return account;
	}
	
	public Account doWithdrawal(Account account,int amount)throws Exception
	{
		System.out.println(" Account Withdrawal() Called ");
		
		if(amount > account.getBalance())
		{
			throw new Exception("Transaction Failed .. Insufficient Balance "+account.getBalance()+" and Transaction Amount "+amount);
		}
		
		
		account.setBalance(account.getBalance()-amount);
		return account;
	}
	
	public void doStuff()
	{
		System.out.println(" doStuff() called ....");
	}
	
	
}
