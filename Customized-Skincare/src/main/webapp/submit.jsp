<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bingo! Here are your products :-)"${name}"</title>
</head>
<body>
    <c:forEach var="product" items="${products}">
        <h2><c:out value="${product.id}"/> </h2>
        <h2><c:out value="${product.skintype}"/> </h2>
    </c:forEach>
</body>
</html>