package com.tmobile.student.web.dto;

public class StudentAddressDTO {

    private long id;
    private long studentID ; 
    private String studentNo;
	private String firstName;
	private String lastName; 
    private String address;
    private String city;
    private String state ;
    private String zipCode ;
    
    
       
	public StudentAddressDTO() {
		super(); 
	}


	public StudentAddressDTO(long id, long studentID, String studentNo, String firstName, String lastName, String address, String city,
			String state, String zipCode) {
		super();
		this.id = id;
		this.studentID = studentID;
		this.studentNo = studentNo;
		this.firstName = firstName;
		this.lastName = lastName;
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


	public long getStudentID() {
		return studentID;
	}


	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	
	public String getStudentNo() {
		return studentNo;
	}

	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	
	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
