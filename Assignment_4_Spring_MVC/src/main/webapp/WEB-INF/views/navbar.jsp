<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Navbar</title>
<style type="text/css">
	nav{
	background-color: cyan;
	padding: 12px;
	}
	a{
	color:blue;
	font-family:arial;
	text-decoration: none;
	margin-left: 65px;
	font-weight: bolder;
	}
	a:hover {
	color: green;
}
</style>
</head>
<body>
	<nav>
		<a href="./addStudent">Add Student Details</a>
		<a href="./updateStudentDetails" >Update Student Details</a>
		<a href="./deleteStudent" >Delete Student Details</a>
		<a href="./showStudent" >Show Student Details</a>
		<a href="./showAllStudent" >Show All Student Details</a>
		<a href="./logout">Logout </a>
	</nav>
</body>
</html>