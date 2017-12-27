package com.tmobile.student.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmobile.student.backend.entity.Student;
import com.tmobile.student.backend.entity.StudentAddress;
import com.tmobile.student.backend.repository.StudentAddressRepository;
import com.tmobile.student.web.dto.StudentAddressDTO;

@Controller
public class StudentAddressController {

	@Autowired
	private StudentAddressRepository studentAddressRepository;
	
	
	@RequestMapping(value ="/")
	public String address(){
		return "homePage"; //return homePage.jsp 
	}
	
	
	@RequestMapping("/searchResult")
	public String searchAddress(@RequestParam("studentNo") String studentNo, Map<String, Object> model){
		

		
		List<StudentAddressDTO> saDTOs = studentAddressRepository.findStudentAddressByStudentNo(studentNo);
		model.put("AddressList", saDTOs);
				
		return "searchResult" ;
	}
	
	
	@RequestMapping(value ="/deletePage")
	public String deleteAddress(@RequestParam("studentNo2") String studentNo2, @RequestParam("studentAddressID") String studentAddressID,Map<String, Object> model){
		
		studentAddressRepository.deleteStudentAddressByStudentNo(studentAddressID);
		
		//refresh, query again
		List<StudentAddressDTO> saDTOs = studentAddressRepository.findStudentAddressByStudentNo(studentNo2);
		model.put("AddressList", saDTOs);
		
		return "searchResult";
	}
	
	
	@RequestMapping(value ="/createStudent")
	public String createStudent(){
	
		return "createStudent" ;
	}

	
//	@RequestMapping(value ="/insertStudent", method=RequestMethod.POST)
//	public String insertStudent(@RequestBody Student student, Map<String, Object> model){
//	
//		studentAddressRepository.createStudent(student);
//		
//		return "homePage" ;
//	}
	
	
	
	 
	
	@RequestMapping(value ="/insertStudent", method=RequestMethod.POST)
	public String insertStudent(@RequestBody Student student){
		
		studentAddressRepository.createStudent(student);
		ResponseEntity<Student> s = new ResponseEntity<Student>(student, HttpStatus.OK);
		return "homePage";
	}
	
	
	
	
	//	
//	@RequestMapping(value ="/createAddress")
//	public String createAddress(){
//	
//		return "createAddress" ;
//	}
	
//	@RequestMapping(value ="/insertAddress", method=RequestMethod.POST)
//	public String insertAddress(@RequestBody StudentAddress studentAddress, Map<String, Object> model){
//	
//		studentAddressRepository.createStudentAddress(studentAddress);
//		
//		return "homePage" ;
//	}
	 
	
}
