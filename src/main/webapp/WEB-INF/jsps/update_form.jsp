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
	<h2>update lead information</h2>
	<form action="updateLeads" method="post">
	<pre>
	ID<input type="text" name="id" value="${leads.id}">
	Name<input type="type" name="name" value="${leads.name}">
	City<input type="type" name="city" value="${leads.city}">
	Role<input type="text" name="role" value="${leads.role}">
	<input type="submit" value="save">
	</pre>
	</form>
</body>
</html>