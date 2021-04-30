package com.capg.lab7.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.capg.lab7.beans.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	Map<Integer,Employee> empHashMap = new HashMap<Integer, Employee>();
	
	

	public void insertingEmployee(Employee e) throws InvalidSalaryException {
		
		
		// code to log the entry of entry
		
		// code for security layer if any
		
		// code for data validation if any
		
		if(e.getSalary()>5000 && e.getSalary()<20000 && e.getDesignation().equalsIgnoreCase("system associate"))
		{
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000 && e.getDesignation().equalsIgnoreCase("programmer"))
		{
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary()>=40000 && e.getDesignation().equalsIgnoreCase("manager"))
		{
			e.setInsuranceScheme("Scheme A");
		}
		else if(e.getDesignation().equalsIgnoreCase("clerk")) {
			if(e.getSalary() > 5000) {
			//	InvalidSalaryException invalid = new InvalidSalaryException("No Balanace");
				//throw(invalid);    
				throw new InvalidSalaryException(e.getSalary());
			}
			else if(e.getSalary()<5000 && e.getDesignation().equalsIgnoreCase("clerk"))
			e.setInsuranceScheme("No Scheme");
		}
		 
		// code for data insertion into database
		
		empHashMap.put(e.getId(), e);
		
		
		// code to log all data insertion return statement
		
		
	}
	

	public List<Employee> getAllEmployees() {

		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();	
		for(Map.Entry<Integer, Employee> i: empHashMap.entrySet()) {
			
				tempList.add(i.getValue());
			
		}
		return tempList;
	}
	
	public List<Employee> getAllEmployeesByScheme(String s) {

		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();	
		for(Map.Entry<Integer, Employee> i: empHashMap.entrySet()) {
			if(i.getValue().getInsuranceScheme().equalsIgnoreCase(s)) {
				tempList.add(i.getValue());
			}
		}
		return tempList;
		
	}


	public boolean removeEmployee(int id) {
		empHashMap.remove(id);
		return true;
	}
}
