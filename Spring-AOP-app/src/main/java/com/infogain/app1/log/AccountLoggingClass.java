package com.infogain.app1.log;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.infogain.app1.dto.Account;

@Aspect
@Component
public class AccountLoggingClass {
	
	@Before("execution(public void com.infogain.app1.service.AccountService.accountTask())")
	public void doLogging()
	{
		System.out.println("===>Account Logging Task executed ...");
	}
	
	//@Before("execution(public * do*(*,*))")
	//@Before("execution(public * do*(..))")  // 0 or more arg
	@Before("execution(public com.infogain.app1.dto.Account do*(*,*))")
	public void doLoggingOverTransaction(JoinPoint joinpoint)
	{
		System.out.println("===>Account Transaction Logging "+LocalDate.now());
		
		MethodSignature methodSignature = (MethodSignature)joinpoint.getSignature();
		System.out.println(methodSignature);
		
		
		Object arr[] = joinpoint.getArgs();
		
		for (Object argInfo : arr) {
			System.out.println(" ---->> "+argInfo);
			
			if(argInfo instanceof Account)
			{
				Account tempAcc = (Account) argInfo;
				System.out.println(tempAcc);
			}
		}
		
	}
	
	@After("execution(public void accountTask())")   // @After runs always 
	public void doLogging2()
	{
		System.out.println("===>Account Logging Task After executed ...");
	}
	
	
	@AfterReturning(pointcut = "execution(public com.infogain.app1.dto.Account do*(*,*))",
			returning = "result")
	public void logTransactionAfterReturning(JoinPoint joinpoint,Account result)
	{
		System.out.println("===>Account Logging Task AfterReturning  ..."+result);
	}
	
	@AfterThrowing(pointcut = "execution(public com.infogain.app1.dto.Account do*(*,*))",
			throwing = "exception")
	public void logTransactionAfterException(JoinPoint joinpoint,Exception exception )
	{
		System.out.println("===>Account Logging Task After Exception  ..."+exception);
	}
	
	

}//end aspect class
























