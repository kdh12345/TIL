<%@page import="dao.MemberDAO"%>
<%@page import="dto.MemberDTO"%>
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

<jsp:useBean id="dto" class="dto.MemberDTO" scope="request"/>
<jsp:setProperty property="id" name="dto" param="id"/>
<jsp:setProperty property="password" name="dto" param="password"/>
<jsp:setProperty property="name" name="dto" param="name"/>
<jsp:setProperty property="phone" name="dto" param="phone"/>
<jsp:setProperty property="email" name="dto" param="email"/>
<jsp:setProperty property="regDate" name="dto" param="regDate"/>
<%
	MemberDAO dao = new MemberDAO();
	/*MemberDTO dto1 = new MemberDTO();
	String id      = request.getParameter("id");
	String pw      = request.getParameter("password");
	String name    = request.getParameter("name");
	String phone   = request.getParameter("phone");
	String email   = request.getParameter("email");
	String regDate = request.getParameter("regDate");
	dto1.setId(id);
	dto1.setPassword(Integer.parseInt(pw));
	dto1.setName(name);
	dto1.setPhone(phone);
	dto1.setEmail(email);
	dto1.setRegDate(regDate);*/
	
	dao.updateMember(dto);
%>

<jsp:forward page="updatesuccess.jsp" />


</body>
</html>