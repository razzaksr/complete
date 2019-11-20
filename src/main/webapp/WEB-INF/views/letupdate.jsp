<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<form action="updated" method="post">
<table align="center" style="border-style: hidden;">
<tr><th><h1>Zealous Edit Student</h1></th></tr>
<tr><td>Identity of Student</td><td><input type="text" name="ano" value="${one.ano }"></td></tr>
<tr><td>Name of Student</td><td><input type="text" name="name" value="${one.name }"></td></tr>
<tr><td>Student Address</td><td><input type="text" name="address" value="${one.address }"></td></tr>
<tr><td>Institute of Student</td><td><input type="text" name="institution" value="${one.institution }"></td></tr>
<tr><td>Contact of Student</td><td><input type="text" name="contactno" value="${one.contactno }"></td></tr>
<tr><td>E-Mail of Student</td><td><input type="text" name="email" value="${one.email }"></td></tr>
<tr><td>Course taken by Student</td><td><input type="text" name="course" value="${one.course }"></td></tr>
<tr><td>Course amount of Student</td><td><input type="text" name="courseamount" value="${one.courseamount }"></td></tr>
<tr><td>Joining date</td><td><input type="text" name="dateofjoined" value="${one.dateofjoined }"></td></tr>
<tr><td>First Paid</td><td><input type="text" name="firstpaid" value="${one.firstpaid }"></td></tr>
<tr><td>Date of First Pay</td><td><input type="text" name="firstdatepaid" value="${one.firstdatepaid }"></td></tr>
<tr><td>Date to be Paid</td><td><input type="text" name="datetobepaid" value="${one.datetobepaid }"></td></tr>
<tr><td>Fully paid/ not</td><td><input type="text" name="finalpaid" value="${one.finalpaid }"></td></tr>
<tr><td>Date of Completion</td><td><input type="text" name="dateofcompletion" value="${one.dateofcompletion }"></td></tr>
<tr><td>Certification status</td><td><input type="text" name="certificate" value="${one.certificate }"></td></tr>
<tr><td><input type="submit" value="Edit"></td><td><input type="reset" value="Clear All"></td></tr>
</table>
</form>
</body>
</html>