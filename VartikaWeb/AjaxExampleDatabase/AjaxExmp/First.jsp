<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.println("HELLOW 5's table is below<br>"); %>
<%int i ,var =5;
for(i=1;i<=10;i++)
{
	out.println(var+" X "+i+" = "+var*i);
out.println("<br>");	
	}%>

<%=var%>
</body>
</html>