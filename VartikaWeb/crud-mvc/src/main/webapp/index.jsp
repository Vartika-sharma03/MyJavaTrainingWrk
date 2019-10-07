<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head><title>Customer Administration Page</title></head>
<body>
<div align="center">
<h2>Customer Management Form</h2>
<form method="get" action="search.jsp">
<input type="text" name="keyword" /><br>
<input type="submit" value="Search"/>

</form>
<h3><a href="/new"> New Customer</a> </h3>
<table border="1" cellpadding="5">
<tr><th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Address</th>
</tr>
<c:forEach items="${listCustomer}" var="customer">
<tr>
<td>${customer.id}</td>
<td>${customer.name}</td>
<td>${customer.email}</td>
<td>${customer.address}</td>
<td><a href="edit_customer.jsp"?id=${customer.id}">Edit</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="delete?id=${customer.id}">Delete</a>
</td>
</tr>
</c:forEach>

</table>

</div>
</body>
</html>



<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
