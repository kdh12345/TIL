<%@page import="springmvc.HelloDTO"%>
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

<%HelloDTO dto = (HelloDTO)request.getAttribute("model"); %>
<h1>hello.jsp</h1>
<%=dto.getMessage() %>
<hr>

<h3>${model.message }</h3>
</body>
</html>