package com.capg.lab7.beans;


public class Employee implements Comparable<Employee> {

	private String empName;
	private int id;
	private int salary;
	private String designation;
	private String insuranceScheme;
	 
    public Employee(String empName, int id, int salary, String designation) {
		this.designation = designation;
		//this.insuranceScheme = insuranceScheme;
		this.empName = empName;
		this.id = id;
		this.salary = salary;
		//this.projectName = projectName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	private String projectName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
	  // 1000 line code
		
		int myHashCode = 0;
		myHashCode = empName.length()+id+designation.length();
		return myHashCode;
	}
	

	@Override    //        (Animal a)
	public boolean equals(Object obj) {
		
		
		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Employee)
		{
		  Employee e = (Employee)obj;	
		  
		  boolean a = this.empName.equals(e.empName);
		  boolean b = (this.id == e.id);
		  boolean c = this.salary == e.salary;
		  boolean d = this.designation.equals(e.designation);
		  
		  return a&&b&&c&&d;
			
		}
		return isSame;
	}
	
	public int compareTo(Employee o) {
		return this.id - o.getId();
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + ", salary=" + salary + ", designation= " + designation
				+ "]";
	}

	
}
