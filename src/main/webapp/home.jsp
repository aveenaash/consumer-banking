<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<h2>Hello ${customer.name}</h2>
	<br/>
	Last Signed On :  ${customer.lastSignedOn}
	<br/>
	<br/>
	<br/>
	<a href="account?customerid=${customer.id}">Add Account</a>
</body>
</html>
