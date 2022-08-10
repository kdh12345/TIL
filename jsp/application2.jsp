<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
String[] menu = {"회원관리","게시판관리","쇼핑몰관리","챗봇관리"};
application.setAttribute("menu", menu);
session.setAttribute("id", "user");
%>
</body>
</html>