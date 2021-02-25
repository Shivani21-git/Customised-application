<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome!</title>
</head>
<body>
    <h2>Please fill the below details!</h2>
     <form:form action="/submit" method="post" modelAttribute="details" name="form">
    <table ><tr>
     <th>Name</th>
    <th>Gender</th>
    <th>Age</th>
    <th>Skintype</th>
    <th>Concern</th></tr>
    <tr>
    <td><form:input type="text" path="name" id="name"/></td>
    <td><form:input type="text" path="gender" id="gender"/></td>
    <td><form:input type="text" path="age" id="age"/></td>
    <td><form:input type="text" path="skintype" id="skintype"/></td>
    <td><form:input type="text" path="concern" id="concern"/></td>
    </tr>
    </table>

    <input type="submit" value="submit"/>
    </form:form>
</body>
</html>