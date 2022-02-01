<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
String err = (String) request.getAttribute("err");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
		<%
		if (err != null && !err.isEmpty()) {
		%>
		<h4 style="color: red"><%=err%></h4>
		<%
		}
		%>
		<legend>Student Login</legend>
		<form action="./add" method="post">
			<table>
				<tr>
					<td><label>Enter the Id:</label></td>
					<td><input type="number" name="id"></td>
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
			<input type="submit" value="Add Data"> <br>
		</form>
	</fieldset>
</body>
</html>