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
<%request.setCharacterEncoding("utf-8"); %>
<h1>${dto.id }회원님 ${dto.age }살 입니다.</h1>
<h1>취미는
<c:forEach items="${dto.hobby }" var="h">
	${h },
</c:forEach> 
입니다.</h1>
<h3>${result }</h3>
</body>
</html>