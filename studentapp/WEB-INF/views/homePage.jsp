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
<title>Student Info System</title>
</head>
<body>


	<h1>Student Address Search</h1>
	<form action="<c:url value="/searchResult" />" method="GET">
		<table border="0">
			<tbody>
				<tr>
					<td>Student ID:</td>
					<td><input type="text" title="Enter Student Number"
						name="studentNo" value="" size="20" /></td>
					<td><input type="submit" value="Search" name="submit" /></td>
				</tr>
			</tbody>
		</table>
	</form>

	<form action="<c:url value="/createStudent" />" method="POST">
		<table border="0">
			<tbody>
				<tr>
					<td><input type="submit" value="Add New Student" name="createStudent" /></td>
				</tr>
			</tbody>
		</table>
	</form>

<%-- 	<form action="<c:url value="/createAddress" />" method="GET">
		<table border="0">
			<tbody>
				<tr>
					<td><input type="submit" value="Add New Address for Existing Student" name="createAddress" /></td>
				</tr>
			</tbody>
		</table>
	</form> --%>


</body>
</html>