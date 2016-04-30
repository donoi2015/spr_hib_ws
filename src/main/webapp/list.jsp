<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>All Persons</h1>
    <table border="1">
        <tr>
            <th>id</th>
            <th>Age</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <c:forEach var="p" items="${persons}">
            <tr>
                <td>${p.id}</td>
                <td>${p.age}</td>
                <td>${p.firstName}</td>
                <td>${p.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
