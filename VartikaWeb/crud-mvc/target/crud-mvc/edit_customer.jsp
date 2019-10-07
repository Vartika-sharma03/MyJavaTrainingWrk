<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Edit Customer</title></head>
<body>
<div align="center">
<h2>Edit Customer</h2>
<form:form action="save" method="post"  modelAttribute="customer">
<table border="0" cellpadding="5">
<tr>
<td>ID:</td>
<td>${customer.id}
<form:hidden path="id"/>
</td>
</tr>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Email:</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<td>Address:</td>
<td><form:input path="address"/></td>
</tr>

</table>

</form:form>
</div>
</body>
</html>