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
String[] menu = (String[])application.getAttribute("menu");
for(int i = 0 ;i < menu.length;i++){
	%>
	<%=menu[i]+" " %>
<% 
}
%>
현재사용자 아이디는 <%=session.getAttribute("id") %>입니다.
</body>
</html>