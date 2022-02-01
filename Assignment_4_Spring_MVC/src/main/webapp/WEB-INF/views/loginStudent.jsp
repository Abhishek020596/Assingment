<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String err = (String) request.getAttribute("err");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<style>
h2 {
	font-size: 30px;
}

#container {
	width: 360px;
	padding: 10px;
	margin: 10px;
	text-align: center;
	border: 2px solid black;
	padding: 10px;
	margin-left: 550px;
	margin-top: 100px;
	color: black;
	border-radius: 25px;
}

label {
	font-weight: bolder;
	font-size: 20px;
}

input {
	border-radius: 20px;
}
</style>
<body>
	<%
	if (err != null && !err.isEmpty()) {
	%>
	<p style="color: red; font-size: 40px; text-align: center;"><%=err%></p>
	<%
	}
	%>
	<form action="./home" method="post">
		<div id="container">
			<h2>Student Login</h2>
			<label>Enter the Id:</label> <input type="number" name="id"><br>
			<br> <label>Enter the Password:</label> <input type="password"
				name="password"><br> <br> <input
				type="submit" value="Login">
		</div>
	</form>
</body>
</html>