<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<h1>나는 JSP 파일입니다.</h1>
<% String type="servlet";
%>
<h1>나는 <%=type %> 파일입니다.</h1>
<%
Date now = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
String nowString = sdf.format(now);
%>
<h1><%=nowString %></h1>
</body>
</html>