<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
Integer details = (Integer) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
<fieldset>
            <%
			if (msg != null && !msg.isEmpty()) {
			%>
			<h4 style="color: green"><%=msg%></h4>
			<%
			}
			%>
			
		<legend>Student Update</legend>
		<form action="./updateStudentDetails" method="post">
			<table>
				<tr>
					<td><label>Enter the Id:</label></td>
					<td><input type="number" name="id" value="<%=details %>" disabled="disabled">
					</td>
				</tr>
				<tr>
					<td><label>Enter the Name:</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>Enter the Address:</label></td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td><label>Enter the Password:</label></td>
					<td><input type="password" name="password"></td>
				</tr>

			</table>
			<input type="submit" value="Update Data"> <br>
			</form>
</fieldset>
</body>
</html>