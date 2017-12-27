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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a New Student</title>
</head>
<body>

	<form action="<c:url value="/insertStudent" />" method="POST">
		<table border="0">
			<tbody>
				<tr>
					<td>Student ID:</td>
					<td><input type="text" title="Enter Student ID"
						name="studentNo" value="" size="10" /></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" title="Enter First Name"
						name="firstName" value="" size="20" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" title="Enter Last Name" name="lastName"
						value="" size="20" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" name="submit" /></td>
				</tr>
			</tbody>
		</table>
	</form>

</body>
</html>