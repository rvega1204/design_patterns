<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Result Page</title>
  </head>
  <body>
    <h1>Result Page</h1>
    <p>
      <%    int result = (Integer) request.getAttribute("result");
            System.out.println("Average of two numbers: " + result);
      %>
    </p>
  </body>
</html>
