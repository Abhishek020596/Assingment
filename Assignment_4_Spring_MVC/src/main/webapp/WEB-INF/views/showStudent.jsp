<%@page import="com.te.librarymanagementsystems.bean.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<%
StudentDetails details = (StudentDetails)request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Student Details</title>
<style>
#emp {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 50%;
	text-align: center;
	align-self: center;
}

#emp td, #emp th {
	border: 1px solid #ddd;
	padding: 8px;
}

#emp tr:nth-child(even) {
	background-color: #f2f2f2;
}

#emp tr:hover {
	background-color: #ddd;
}

#emp th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<br>
	<br>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h1 style="color: red;"><%=msg%></h1>
	<%
	}
	%>
	<form action="./showStudent" method="post">
		<div style="text-align: center; font-size: 20px">
			<label>Enter Your Id:</label> <input type="number" name="id">
			<input type="submit" value="Search">
		</div>
	</form>
	<%
	if (details != null) {
	%>
	<br>
	<br>
	<br>
	<table id="emp">
		<tr>
			<th>ID</th>
			<td><%=details.getId()%></td>
		</tr>
		<tr>
			<th>Name</th>
			<td><%=details.getName()%></td>
		</tr>
		<tr>
			<th>Address</th>
			<td><%=details.getAddress()%></td>
		</tr>
		<tr>
			<th>Password</th>
			<td><%=details.getPassword()%></td>
		</tr>
	</table>
	<%
	}
	%>

</body>
</html>