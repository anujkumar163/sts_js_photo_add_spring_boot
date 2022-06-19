<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>list of all leads</h2>
	<table>
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>City</th>
	<th>Role</th>
	<th>Delete</th>
	<th>Update</th>
	</tr>
	
	<c:forEach items="${leads}" var="leads">
	<tr>
	<td>${leads.id}</td>
	<td>${leads.name}</td>
	<td>${leads.city}</td>
	<td>${leads.role}</td>
	<td><a href="delete?id=${leads.id}">Delete</a></td>
	<td><a href="update?id=${leads.id}">Update</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>