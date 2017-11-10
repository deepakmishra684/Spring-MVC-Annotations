<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>USER NAME :</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>USER PASSWORD :</td>
			<td>${user.password}</td>
		</tr>
		<tr>
			<td>USER GENDER :</td>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<td>USER CITY :</td>
			<td>${user.city}</td>
		</tr>
	</table>
</body>
</html>