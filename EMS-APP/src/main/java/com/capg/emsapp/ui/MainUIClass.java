package com.capg.emsapp.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.emsapp.beans.*;
import com.capg.emsapp.service.*;
import com.capg.emsapp.service.*;

public class MainUIClass {
	
	IEmployeeService empService;
	
	public MainUIClass() {
		empService = new EmployeeServiceImpl();
		//sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		MainUIClass obj = new MainUIClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		while(true) {
			System.out.println("1. To insert Employee information\n2. To Display all Employees\n3. To display Employees within  Salary Range\n4. To get employee by id\n5. Exit");
		
			int num= sc.nextInt();
			switch(num) {
			case 1:
				obj.insertEmployeeInforamtion();
				break;
			case 2:
				
				obj.displayAllEmployee();
				break;
			case 3:
				System.out.println("to get the employees within range\nEnter the range 1");
				int range1 = sc.nextInt();
				System.out.println("Enter range 2");
				int range2 = sc.nextInt();
				obj.displayEmployeesBySalary(range1, range2);
				break;
			case 4:
				System.out.println("Enter the Id number of employee");
				int id = sc.nextInt();
				obj.displayEmployeesById(id);
				break;
			case 5:
				System.exit(0);
			}
		}
		// menu based program 
		
		
	}
	
	public void insertEmployeeInforamtion()
	{
		Scanner in = new Scanner(System.in);
		System.out.println(" \n Enter Employee Information\n");
		System.out.println(" Enter Employee Name ");
		String empName = in.nextLine();
		
		System.out.println(" Enter Employee Id ");
		int id = Integer.parseInt(in.nextLine());
		
		System.out.println(" Enter Employee Salary ");
		int salary = Integer.parseInt(in.nextLine());
		
		System.out.println(" Enter Employee Designation ");
		String designation = in.nextLine();
		
		Employee e = new Employee(empName,id,salary,designation);
		
		
		try{
			boolean isInserted = empService.insertEmployee(e);
		}
		catch(Exception ex) {
			System.out.println(" Contact HR "+ex);
		
		}
		
		
	}
	
	public void displayAllEmployee()
	{
		
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployees();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(" Name "+ e.getEmpName());
		System.out.println(" ID "+ e.getId());
		System.out.println(" Salary "+e.getSalary());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	
	
	public void displayEmployeesBySalary(int range1,int range2)
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployeesBySalary(range1,range2);
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayEmployeesById(int id)
	{
		System.out.println("\n=========== Employees Information ===========\n");
		Employee e = empService.getEmployeeById(id);
		
		displayEmployee(e);
	}
	

}