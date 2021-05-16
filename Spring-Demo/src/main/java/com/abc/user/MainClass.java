package com.abc.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Account;

public class MainClass {

	public static void main(String[] args) {
		
	
		
		// Start Spring Container
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
		
		// Get the Object from Spring 
		
		Account account = (Account)spring.getBean("account2");
		
		// use object as per business req.
		
		System.out.println(account);
		System.out.println(account.getBalance());
		System.out.println(account.getPolicy().getPolicyName());
	}
	
	
	public void withoutSpringApporach()
	{
		// approach 1
		Account a = new Account();
		a.setAccId(101);
		a.setAccountHolderName("abc");
		a.setBalance(5000);
		
		// approach 2
		Account a2 = new Account(102,"cd", 454);
		
		
	}



}