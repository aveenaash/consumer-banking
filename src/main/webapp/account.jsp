<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account</title>
</head>
<body>
	<h1>Account Form</h1>
	<form:form id="accountForm" modelAttribute="accountDto" action="save-account" method="post">
		<form:input type="hidden" path="customerId" name="customerId"/>
		<table align="center">
			<tr>
				<td><form:label path="accountType">Account Type : </form:label></td>
				<td><form:select path= "accountType">
						<option value="checking">Checking</option>
						<option value="savings">Savings</option>
				</form:select></td>
			</tr>
			<tr>
				<td><form:label path="balance">Balance :</form:label></td>
				<td><form:input path="balance" name="balance"
						id="balance" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="account" name="account">Create Account</form:button>
				</td>
			</tr>
			<tr></tr>
			
		</table>
	</form:form>
</body>
</html>