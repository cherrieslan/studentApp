<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page session="false"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<td>First Name </td>
				<td>Last Name </td>
				<td>Student No. </td>
				<td>Address </td>
				<td>City </td>
				<td>State </td>
				<td>Zip Code </td>
			</tr> 
		</thead>

	    <tbody>
	    	<c:forEach items = "${AddressList}" var="sa">
	        <tr>
	        	<td>${sa.firstName}</td>
	        	<td>${sa.lastName}</td>
	        	<td>${sa.studentNo}</td>
	            <td>${sa.address}</td>
	            <td>${sa.city}</td>
	            <td>${sa.state}</td>
	            <td>${sa.zipCode}</td>
	            
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>   



</body>
</html>