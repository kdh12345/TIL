<%@page import="dao.MemberDAO"%>
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
	String id   = request.getParameter("id");
	String pw   = request.getParameter("pw");
	String role = request.getParameter("role");
	
	MemberDAO dao = new MemberDAO();
	int condition = dao.selectMember(id, pw);
	if( condition == 1 ){
	%>
		<h2>비밀번호가 다릅니다.재로그인 부탁드립니다.</h2>
		<h2><a href=logindb.jsp?id=<%=id %>>로그인</a></h2>
	<% }
	else if( condition == 3 ){
		%>
		<h2>회원정보가 없습니다.</h2>
		<h2><a href=insertdb.jsp>회원가입</a></h2>
	<% }
	else if( condition == 2 ){
		if(role.equals("admin")) {
		%>
			<h1><%=id %> 계정의 관리자님 로그인하셨습니다 <br></h1>
			<ul>
			<li> 모든 사용자 정보 조회
			<li> 블랙리스트 관리 </li>
			<li> 상품관리 </li>
			</ul>
	<% 	}
		else if(role.equals("user")){
			%>
			<h1><%=id %> 계정의 사용자님 로그인하셨습니다<br></h1>
			<ol>
			<li> 내정보 조회</li>
			<li> 로그아웃 </li>
			<li> 게시판 보기 </li>
			</ol>
		<%} // user 끝
	

}// condition 2 끝
%>

</body>
</html>