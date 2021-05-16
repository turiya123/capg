package com.mkj.abc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		Account account = (Account) context.getBean("account");
		System.out.println(account);
		System.out.println(account.getInsurance().getPremiumAmount());
		
	}
}
