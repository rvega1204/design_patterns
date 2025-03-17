<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>View Student Details</title>
  </head>
  <body>
    <jsp:useBean id="studentDetails" class="com.rvg.patterns.frontcontroller.StudentVO" scope="request" />
    <h1>Student Details</h1>
    <p>Student Id: <jsp:getProperty property="id" name="studentDetails" /></p>
    <p>
      Student Name: <jsp:getProperty property="name" name="studentDetails" />
    </p>
  </body>
</html>
