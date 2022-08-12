<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<form action="start?menu=board"> 
<!--  <form action="mvc/boardsuccess2.jsp"> -->
	제목<input type=text name="title"><br>
	내용<input type=text name="content"><br>
	작성자<input type=text name="writer" value="${session_id }"><br>
	<input type="submit" value="폼 전송"><br>
</form>
</body>
</html>