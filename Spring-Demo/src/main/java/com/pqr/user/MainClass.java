package com.pqr.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pqr.beans.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start Spring Container
		// Start Spring Container
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory1.xml");
		
		// Get the Object from Spring 
		
		Student student = (Student)spring.getBean("student2");
		
		// use object as per business req.
		
		System.out.println(student);
		System.out.println(student.getStudentName());
		System.out.println(student.getCourse().getCourseName());
	}
	
	
	public void withoutSpringApporach()
	{
		// approach 1
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("abc");
		
		// approach 2
		Student s2 = new Student(102,"cd");
		
		
	}


}
