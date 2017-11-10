<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring MVC Login</title>

<spring:url value="/resources/css/testjsp.css" var="coreCss" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />


</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Java Development Blog</a>
		</div>
	</div>
</nav>


<div class="container">

	<div class="row">
		<form role="form" action="login.htm" method="post">
			<div class="col-lg-6">
				<div class="well well-sm">
					<strong><span class="glyphicon glyphicon-asterisk"></span>Required
						Field </strong><strong>Login</strong>
				</div>
				<div class="form-group">
					<label for="username">User Name</label>
					<div class="input-group">
						<input type="text" class="form-control" name="username"
							id="username" placeholder="User Name" required> <span
							class="input-group-addon"><span
							class="glyphicon glyphicon-asterisk"></span></span>
					</div>
				</div>
				<div class="form-group">
					<label for="password">Password</label>
					<div class="input-group">
						<input type="password" class="form-control" id="password"
							name="password" placeholder="Password" required> <span
							class="input-group-addon"><span
							class="glyphicon glyphicon-asterisk"></span></span>
					</div>
				</div>

				<input type="submit" name="submit" id="submit" value="Login"
					class="btn btn-info">
			</div>
		</form>
	</div>

</div>

<spring:url value="/resources/css/testjsp.js" var="coreJs" />
<spring:url value="/resources/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>