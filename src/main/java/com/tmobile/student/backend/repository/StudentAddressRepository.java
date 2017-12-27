package com.tmobile.student.backend.repository;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tmobile.student.backend.entity.Student;
import com.tmobile.student.backend.entity.StudentAddress;
import com.tmobile.student.backend.rowmapper.StudentAddressRowmapper;
import com.tmobile.student.web.dto.StudentAddressDTO;


@Repository
public class StudentAddressRepository {

	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	 
	 
	 public List<StudentAddressDTO> findAllStudentAdress() { 
		 
		String sql = "SELECT sa.*, s.student_no, s.first_name, s.last_name " + "FROM STUDENT_ADDRESS sa "
		              + "INNER JOIN STUDENT s ON s.id = sa.student_id"; 
	  
		List<StudentAddressDTO> results = jdbcTemplate.query(sql, new StudentAddressRowmapper());
		
		return results;
	 }
	 
	 
	 
	 public List<StudentAddressDTO> findStudentAddressByStudentNo(String studentNo) { 
		 
		String sql = "SELECT sa.*, s.student_no, s.first_name, s.last_name " + "FROM STUDENT_ADDRESS sa "
		              + "INNER JOIN STUDENT s ON s.id = sa.student_id and s.student_no like '%"    + studentNo +"%' "; 
	  
		List<StudentAddressDTO> results = jdbcTemplate.query(sql, new StudentAddressRowmapper());
		
		return results;
	 }
	 
	 
	 public void deleteStudentAddressByStudentNo(String studentAddressID) { 
		 
		 String sql = "DELETE FROM STUDENT_ADDRESS sa WHERE sa.id = " + studentAddressID;
			
		 jdbcTemplate.update(sql);
		 

	 }  
	 
	 
	 public void createStudent(Student student){
		 
		 String studentNo = student.getstudentNo();
		 String firstName = student.getfirstName();
		 String lastName = student.getlastName(); 
		 
		 String sql = "INSERT INTO student (student_no, first_name, last_name) VALUES(" + studentNo + ", " + firstName + ", " + lastName + ")";

		 jdbcTemplate.update(sql);
	 }

	 
	 
//	 public void createStudentAddress(StudentAddress studentAddress){ 
//		 long id = student.getId(); // foreign key to student table
//		 String address = studentAddress.getAddress();
//		 String city = studentAddress.getCity();
//		 String state = studentAddress.getState();
//		 String zipCode = studentAddress.getzipCode();
//		 
//		 
//		 String studentID = Long.toString(id);
//		 
//		 String sql = "INSERT INTO student_address (student_id, address, city, state, zip_code) VALUES(" 
//				 		+ studentID + ", " + address + ", " + city + ", " + state + ", " + zipCode + ")";
//		  
//		 jdbcTemplate.update(sql); 
//	 }
	 
	 
	 
	 
	 
	 
	 //requestbody - post
	 //for restful - put
//	 public void editStudentAddress(String address) { 
//		 
//		String sql = "UPDATE STUDENT_ADDRESS sa SET address = " + address;
//		
//	 }
	 
	 
	 
}
