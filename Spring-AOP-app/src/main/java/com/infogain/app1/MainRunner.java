package com.infogain.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infogain.app1.dto.Account;
import com.infogain.app1.service.AccountService;

public class MainRunner {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		Account account = spring.getBean("account",Account.class);
		AccountService accountService = spring.getBean("accountService",AccountService.class);
		
		System.out.println(accountService);
		
		accountService.accountTask();
		System.out.println("=======================");
		
		accountService.doDeposit(account,6000);
		System.out.println("=======================");
		
		try {
			accountService.doWithdrawal(account,8000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================");
		
		accountService.doStuff();
		System.out.println("=======================");
		
		
		
	}
}
