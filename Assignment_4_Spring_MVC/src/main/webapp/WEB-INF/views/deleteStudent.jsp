<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
String string = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Form</title>
</head>
<body><br><br>
	<%
		if (string != null && !string.isEmpty()){
	%>
	<h2><%=string%></h2>
	<%
		}
	%>
	<form action="./deleteStudent" method="post">
	<div style="text-align: center; font-size: 20px;">
		<label>Enter the Id</label> 
		<input type="number" value="id" name="id"> 
		<input type="submit" value="Delete">
		</div>
	</form>
</body>
</html>