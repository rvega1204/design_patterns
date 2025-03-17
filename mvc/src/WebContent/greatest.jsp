<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Greatest Number Result</title>
</head>
<body>
    <h1>Greatest Number Result</h1>
    <% 
        int result = (Integer) request.getAttribute("result");
        System.out.println("Greatest of two numbers: " + result);
    %>
</body>
</html>