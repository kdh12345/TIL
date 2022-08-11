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
<%--  <%
MemberDTO dto = new MemberDTO();
dto.setId("id");
dto.setPassword(1111);
dto.setName("name");
dto.setPhone("01011112222");
dto.setEmail("email@mul.com");
%>
<h1> 회원정보를 생성 완료 했습니다. 확인해 볼까요?</h1>
<h3>아이디:<%=dto.getId() %></h3>
<h3>암호:<%=dto.getPassword() %></h3>
<h3>이름:<%=dto.getName() %></h3>
<h3>폰:<%=dto.getPhone() %></h3>
<h3>이메일:<%=dto.getEmail() %></h3>--%>
<jsp:useBean id="dto" class="dto.MemberDTO" />
<<%--  jsp:setProperty property="id" name="dto" value="<%=request.getParameter(\"id\") %>"/> --%>
<jsp:setProperty property="password" name="dto" param="id"/>
<jsp:setProperty property="password" name="dto" param="password"/>
<jsp:setProperty property="name" name="dto" param="name"/>
<jsp:setProperty property="phone" name="dto" param="phone"/>
<jsp:setProperty property="email" name="dto" param="email"/>
<jsp:setProperty property="regdate" name="dto" param="regdate"/>

<h1> 회원정보를 생성 완료했습니다. 확인해볼까요?(액션태그)</h1>
<h3>아이디:<jsp:getProperty property="id" name="dto"></h3>
<h3>암호:<jsp:getProperty property="password" name="dto"></h3>
<h3>이름:<jsp:getProperty property="name" name="dto"></h3>
<h3>폰:<jsp:getProperty property="phone" name="dto"></h3>
<h3>이메일:<jsp:getProperty property="email" name="dto"></h3>
<h3>가입일:<jsp:getProperty property="regdate" name="dto"></h3>
</body>
</html>