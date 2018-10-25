<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<h2>Hello ${registerObject.firstname}  ${registerObject.lastname}</h2>
	<h1>Your Account Details</h1>
	Username : ${registerObject.username}
	Password : ${registerObject.password}
</body>
</html>
