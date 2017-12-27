package com.tmobile.student.backend.entity;

public class StudentAddress {
    private long id;
    private long studentID ; 
    private String address;
    private String city;
    private String state ;
    private String zipCode ;
    

    
	public StudentAddress() {
		super(); 
	}
	
    
    
	public StudentAddress(long id, long studentID, String address, String city, String state, String zipCode) {
		super();
		this.id = id;
		this.studentID = studentID;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getstudentID() {
		return studentID;
	}
	public void setstudentID(long studentID) {
		this.studentID = studentID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getzipCode() {
		return zipCode;
	}
	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
	}

    
}
