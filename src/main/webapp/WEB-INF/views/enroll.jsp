<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<h1>Add new Registration</h1>
<%@taglib prefix="aca" uri="http://www.springframework.org/tags/form" %>
<aca:errors path="academy.*"/>
<form action="enrolled" method="post">
<table align="center" style="border-style: hidden;">
<tr><th><h1>Zealous Enroll Student</h1></th></tr>
<tr><td>Name of Student</td><td><input type="text" name="name"></td></tr>
<tr><td>Student Address</td><td><input type="text" name="address"></td></tr>
<tr><td>Institute of Student</td><td><input type="text" name="institution"></td></tr>
<tr><td>Contact of Student</td><td><input type="text" name="contactno"></td></tr>
<tr><td>E-Mail of Student</td><td><input type="text" name="email"></td></tr>
<tr><td>Course taken by Student</td><td><input type="text" name="course"></td></tr>
<tr><td>Course amount of Student</td><td><input type="text" name="courseamount"></td></tr>
<tr><td>Joining date</td><td><input type="text" name="dateofjoined"></td></tr>
<tr><td>First Paid</td><td><input type="text" name="firstpaid"></td></tr>
<tr><td>Date of First Pay</td><td><input type="text" name="firstdatepaid"></td></tr>
<tr><td>Date to be Paid</td><td><input type="text" name="datetobepaid"></td></tr>
<tr><td>Fully paid/ not</td><td><input type="text" name="finalpaid"></td></tr>
<tr><td><input type="submit" value="Enroll"></td><td><input type="reset" value="Clear All"></td></tr>
</table>
</form>
</body>
</html>