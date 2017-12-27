package com.tmobile.student.backend.entity;

public class Student {
	private long id;
	private String studentNo;
	private String firstName;
	private String lastName;
	

	
	public Student() { 
		super();
	}
	
	
	public Student(long id, String studentNo, String firstName, String lastName) {
		super();
		this.id = id;
		this.studentNo = studentNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getstudentNo() {
		return studentNo;
	}
	public void setstudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
