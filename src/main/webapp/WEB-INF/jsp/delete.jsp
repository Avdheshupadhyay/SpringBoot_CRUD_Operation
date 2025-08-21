<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h2>Enter Student Details</h2>
<form action="/deleteById" method="post">
    <label for="id"> Enter the ID:</label>
    <input type="number" id="id" name="id" required /><br/><br/>
 <button type="submit"> submit </button>

</form>
</body>
</html>
