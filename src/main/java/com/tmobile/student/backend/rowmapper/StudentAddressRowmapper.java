package com.tmobile.student.backend.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tmobile.student.web.dto.StudentAddressDTO;

public class StudentAddressRowmapper implements RowMapper<StudentAddressDTO>{

	@Override
	public StudentAddressDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new StudentAddressDTO (rs.getLong("id"), 
				rs.getLong("student_id"), 
				rs.getString("student_no"),
				rs.getString("first_name"), 
				rs.getString("last_name"), 
				rs.getString("address"), 
				rs.getString("city"), 
				rs.getString("state"), 
				rs.getString("zip_code")
				); 		
	}


}
