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
<title>Insert title here</title>
</head>
<body>

	<form action="<c:url value="/createAddress" />" method="POST">
		<table border="0">
			<tbody>
				<tr>
					<td>Address:</td>
					<td><input type="text" title="Enter Street Address"
						name="address" value="" size="30" /></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text" title="Enter City" name="city" value=""
						size="10" /></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input type="text" title="Enter State" name="state"
						value="" size="10" /></td>
				</tr>
				<tr>
					<td>Zip Code:</td>
					<td><input type="text" title="Enter Zip Code" name="zipCode"
						value="" size="10" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" name="submit" /></td>
				</tr>
			</tbody>
		</table>
	</form>

</body>
</html>