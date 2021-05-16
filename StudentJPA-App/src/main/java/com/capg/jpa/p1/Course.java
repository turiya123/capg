package com.capg.jpa.p1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Student_Course",
			joinColumns=@JoinColumn(name="CourseId"),
			inverseJoinColumns=@JoinColumn(name="StudentId"))
	private List<Student> students;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
