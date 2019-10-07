<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME PAGE</title>
</head>

<body>
keep th epage running for 30sec..........
<br><%
if(session!=null)
{
		if(session.getAttribute("user")!=null)
	{
	String name=(String)session.getAttribute("user");
	out.println("hello,"+ name+"welcome to your profile page");
	
	}
else
{
response.sendRedirect("login.html");

}}

%>
<br>
<br>
<form % action="LogoutControll" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>