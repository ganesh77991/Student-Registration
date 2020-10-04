<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
<p><a href="/Student-Registration">Home</a></p>
	<h2>Student Data Table</h2>

	<table>
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Gender</th>
			<th>Course</th>
			<th>Branch</th>
			<th>Date Of Birth</th>
			<th>Email</th>
			<th>Password</th>
			<th>Address</th>
		</tr>
		<c:forEach var="obj" items="${objs}">
			<tr>
				<td>${obj.id}</td>
				<td>${obj.name}</td>
				<td>${obj.gender}</td>
				<td>${obj.course}</td>
				<td>${obj.branch}</td>
				<td>${obj.dob}</td>
				<td>${obj.email}</td>
				<td>${obj.password}</td>
				<td>${obj.address}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
