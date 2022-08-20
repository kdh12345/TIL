<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
$(document).ready(function(){});
</script>
</head>
<body>
<form action="member" method=post>
아이디:<input type="text" name="id"><br>
비밀번호:<input type="password" name="password"><br>
나이:<input type="text" name="age"><br>
<input type="checkbox" name="hobby" value="독서">독서<br>
<input type="checkbox" name="hobby" value="영화">영화<br>
<input type="checkbox" name="hobby" value="달리기">달리기<br>
<input type="submit" value="회원가입">
</form>
</body>
</html>