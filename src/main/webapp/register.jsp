<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form:form id="registerForm" modelAttribute="registerObject"
		action="register" method="post">
		<table align="center">
			<tr>
				<td><form:label path="firstname">First Name: </form:label></td>
				<td><form:input path="firstname" name="firstname"
						id="firstname" /></td>
			</tr>
			<tr>
				<td><form:label path="lastname">Last Name: </form:label></td>
				<td><form:input path="lastname" name="lastname" id="lastname" />
				</td>
			</tr>
			<tr>
				<td><form:label path="phone">Phone: </form:label></td>
				<td><form:input path="phone" name="phone" id="phone" />
				</td>
			</tr>
			<tr>
				<td><form:label path="email">Email: </form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address: </form:label></td>
				<td><form:input path="address" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender: </form:label></td>
				<td><form:input path="gender" name="gender" id="gender" /></td>
			</tr>
			<tr>
				<td><form:label path="dob">Date Of Birth: </form:label></td>
				<td><form:input path="dob" name="dob" id="dob" /></td>
			</tr>
			<tr>
				<td><form:label path="username">User Name: </form:label></td>
				<td><form:input path="username" name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="register" name="register">Register</form:button>
				</td>
			</tr>
			<tr></tr>
			<tr>
		</table>
	</form:form>
</body>
</html>