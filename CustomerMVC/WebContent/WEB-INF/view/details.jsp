<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello ${Customer.id}</h1>
<br>
<h1>${Customer.name}</h1>
<br>
<h1>${Customer.email}</h1>
<br>
<h1>${Customer.address}</h1>
<br>
<h1>${Customer.contact}</h1>
</body>
</html>