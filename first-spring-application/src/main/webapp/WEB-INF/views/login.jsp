<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<span     style="color: red;">${error }</span> 
 <form action="/spring-mvc/login" method="post">
 Enter Name: <input type="text" name="name"> <br>
 Enter Password :<input type="password" name="password"> <br>
 <input type="submit" value="Submit">
 </form>
</body>
</html>