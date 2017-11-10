<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/mvc1/regSuccess" method="post">
		<table>
			<tr>
				<td>USER NAME</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>USER PASSWORD</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>USER GENDER</td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<td>USER CITY</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>