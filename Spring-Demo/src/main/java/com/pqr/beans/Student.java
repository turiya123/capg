package com.pqr.beans;

import com.abc.beans.Policy;

public class Student {
	
	private int studentId;
	private String studentName;
	private Course course;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [studentId = " + studentId + ", studentName = " + studentName + ", course = " + course + "]";
	}

}
