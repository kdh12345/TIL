<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
String regDate = sdf.format(new Date());
%>
<h1> 회원정보 가입</h1>
<form action="beanrequest1.jsp">
아이디:<input type=text name="id"><br>
암호:<input type=password name="password"><br>
이름:<input type=text name="name"><br>
폰:<input type=text name="email"><br>
이메일:<input type=email name="email"><br>
회원가입일:<input type=text name="regdate" value="<%=new Date()%>"><br>
<input type="submit" value="전송">

</form>
</body>
</html>