<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

<form name="registration" action="RegServlet" method="post">
<input type="hidden" name="pagename" value="register"/>

<table>
<tr>
	<td> First Name</td>
	<td><input type="text" name="txtFNAME"/></td>
</tr>

<tr>
	<td>Last Name</td>
	<td><input type="text" name="txtLName"/></td>
</tr>
<tr>
	<td>Gender</td>
	<td><input type="radio" name="rdoGender" id="Male" value="Male">
	<label for="Male">Male</label>
	<input type="radio" name="rdoGender" id="Female" value="Female">
	<label for="Female">Female</label></td>
</tr>
<tr>
	<td>Email</td>
	<td><input type="text" name="txtEmail"></td>
</tr>
<tr>
	<td>Password</td>
	<td><input type="password" name="txtPassword"/></td>
</tr>
<tr>
	<td>State</td>
	<td>
	<select name="cboStates">
	<option value="NC">NC</option>
	<option value="CA">CA</option>
	</select></td>
</tr>
<tr>
	<td>Age</td>
	<td>
	<select name="cboAge">
		<option value="18">18</option>
		<option value="19">19</option>
		<option value="20">20</option>
	</select>
	</td>
</tr>
<tr>
	<td>Address</td>
	<td>
		<textarea name="txtarAddress"></textarea>
	</td>
</tr>
<tr>
	<td>Skills</td>
	<td>
		<input type="checkbox" name="chkSkills" value="PHP">PHP
		<input type="checkbox" name="chkSkills" value="JAVA">JAVA
		<input type="checkbox" name="chkSkills" value="JSP">JSP
	</td>
</tr>
<tr>
	<td><button type="submit">Submit</button></td>
</tr>


</table>
</form>
</body>
</html>