<%@page import="dto.MemberDTO"%>
<%@ page contentType="text/html; charset=UTF-8"
%>
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
MemberDTO dto = new MemberDTO();
dto.setId("id");
dto.setPassword(11111);
dto.setName("name");
dto.setPhone("01011112222");
dto.setEmail("email@a.com");
dto.setRegDate("2022-08-10");
session.setAttribute("member", dto); %>
</body>
</html>