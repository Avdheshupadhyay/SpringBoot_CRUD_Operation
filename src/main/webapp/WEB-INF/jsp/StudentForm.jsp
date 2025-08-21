<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h2>Enter Student Details</h2>
<form action="/saveStudent" method="post">
    <label for="id">ID:</label>
    <input type="number" id="id" name="id" required /><br/><br/>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required /><br/><br/>

    <label for="section">Section:</label>
    <input type="text" id="section" name="section" required /><br/><br/>

    <button type="submit">Submit</button>
</form>
</body>
</html>
