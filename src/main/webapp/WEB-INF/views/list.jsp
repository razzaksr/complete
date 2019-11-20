<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>Following results are obtain by your search</h1>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<table border="5px" cellspacing="5px" cellpadding="5px">
<tr>
<th>Id of Student</th><th>Name of Student</th><th>Student Address</th><th>Institute of Student</th><th>Contact of Student</th><th>E-Mail of Student</th>
<th>Course of Student</th><th>Course amount of Student</th><th>Joining date</th><th>First Paid</th><th>Date of First Pay</th><th>Date to be Paid</th>
<th>Fully paid/ not</th><th>Certificate Status</th><th>Course Status</th><th>Action</th>
</tr>
<core:forEach var="single" items="${every }">
<tr>
<td>${single.ano }</td><td>${single.name }</td><td>${single.address }</td><td>${single.institution }</td><td>${single.contactno }</td><td>${single.email }</td>
<td>${single.course }</td><td>${single.courseamount }</td><td>${single.dateofjoined }</td><td>${single.firstpaid }</td><td>${single.firstdatepaid }</td>
<td>${single.datetobepaid }</td><td>${single.finalpaid }</td><td>${single.certificate }</td><td>${single.dateofcompletion }</td>
<td><a href="listeditid/${single.ano }/">Edit</a></td>
</tr>
</core:forEach>
</table>
</body>
</html>