<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><title>Search Result for Customer</title></head>
<body>
<div align="center">
<h2>Search Result</h2>

<table border="1" cellpadding="5">
<tr><th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Address</th>
</tr>
<c:forEach items="${result}" var="customer">
<tr>
<td>${customer.id}</td>
<td>${customer.name}</td>
<td>${customer.email}</td>
<td>${customer.address}</td>

</tr>
</c:forEach>

</table>

</div>
</body>
</html>
