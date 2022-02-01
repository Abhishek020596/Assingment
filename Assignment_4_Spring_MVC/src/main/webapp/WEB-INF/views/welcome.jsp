<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String string=(String)request.getAttribute("data"); %>
    <%@include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body style="text-align: center;">
<h2 style="text-align: center; margin-top: 15%; font-size: 40px;"> Welcome To Our Website: <%=string %></h2>
</body>
</html>