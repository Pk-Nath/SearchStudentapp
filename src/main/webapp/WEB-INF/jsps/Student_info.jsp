<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var = "var" scope = "session" value = "${stud}"/>
<c:if test = "${empty var}">
       <h2> ${"data not present for this id"}</h2>
</c:if>
<c:if test = "${not empty var}">
        name: ${stud.name} <br>
        email: ${stud.email}<br>
        mobile: ${stud.mobile}<br>
        fee: ${stud.fee}
</c:if>
</body>
</html>