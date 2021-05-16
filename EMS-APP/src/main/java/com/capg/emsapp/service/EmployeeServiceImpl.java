package com.capg.emsapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.dao.EmployeeDAOImpl;
import com.capg.emsapp.dao.IEmployeeDAO;
/*
 * Includes all functional and non functional req including business logic
 * 
 * */
import com.capg.emsapp.exceptions.EmployeeSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeDAO dao;
	
	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
		// Animal a = new Dog();
	}

	public boolean insertEmployee(Employee e) throws EmployeeSalaryException{
		
		
		// code to log the entry of entry
		
		// code for security layer if any
		
		// code for data validation if any
		
		
		// code for data insertion into database
		
		if(e.getSalary()>5000000)
		{
			throw new EmployeeSalaryException();
		}
		// code for data insertion into database
		
		boolean isInserted = dao.insertEmployee(e);
		
		
		// code to log all data insertion return statement
		
		return isInserted;
		
		
		// code to log all data insertion return statement
		
		
	}
	

	//public void getAllEmployee(String s) {
		
		
		// code to log the entry of entry
		
		// code for security layer if any
		
		// code for data validation if any
		
	//	if
		
		// code to log all data insertion return statement
		
		
	//}

	public List<Employee> getAllEmployees() {
	
		return dao.getAllEmployees();
	}
	
	

	public List<Employee> getAllEmployeesBySalary(int range1,int range2) {

		return dao.getAllEmployeesBySalary(range1, range2);
	}
	
	
	
	
	
	
	

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(id);
	}

}
