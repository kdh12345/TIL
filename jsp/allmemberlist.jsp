<%@page import="dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="error/e.jsp"%>
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
<style>
	table,td{border: 2px solid blue;
	border-collapse: collapse;}
	td{text-align:center;}
	tr:first-child{color:navy;}
</style>
</head>
<body>
<%
MemberDAO dao = new MemberDAO();
ArrayList<MemberDTO> memberLst = dao.selectAllMember();
%>
<h1>모든 회원 정보</h1>
<table>
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>폰번호</td>
		<td>이메일</td>
		<td>가입일자</td>
	</tr>
	<%
		for(int i = 0 ; i < memberLst.size();i++){
			MemberDTO dto = memberLst.get(i);
			%>
			<tr>
				<td><%=dto.getId() %></td>
				<td><%=dto.getName() %></td>
				<td><%=dto.getPhone() %></td>
				<td><%=dto.getEmail() %></td>
				<td><%=dto.getRegDate() %></td>
			</tr>
		<%}
	%>
</table>
</body>
</html>