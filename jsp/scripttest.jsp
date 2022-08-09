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
<!-- 1. jsp 코드 작성하면 서블릿 소스 _jspService 메소드 내부 코드.지역변수
     2.  -->
<%
String msg = "콘솔출력";
System.out.println(msg);
%>

<%
String msg2 = "브라우저출력";
%>
<h1><%=msg2 %></h1>

<%! int multiply(int a, int b){
	return a*b;
} 
%>

<h1>메소드호출결과=<%= multiply(10,5) %></h1>
</body>
</html>