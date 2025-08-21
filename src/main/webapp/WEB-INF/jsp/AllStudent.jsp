<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All Students</title>
</head>
<body>
<h2>Student List</h2>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Section</th>
    </tr>

    <c:forEach var="student" items="${AllStudent}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.section}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
