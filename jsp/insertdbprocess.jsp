<%@page import="dao.MemberDAO"%>
<%@page import="dto.MemberDTO"%>
<%@page import="java.time.LocalDateTime"%>
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
if( request.getMethod().equalsIgnoreCase("post") ){
	
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
int pw = Integer.parseInt(request.getParameter("pw"));
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String email = request.getParameter("email");
String regDate = LocalDateTime.now().toString();

MemberDTO dto = new MemberDTO();
dto.setId(id);
dto.setPassword(pw);
dto.setName(name);
dto.setPhone(phone);
dto.setEmail(email);
dto.setRegDate(regDate);

MemberDAO dao = new MemberDAO();
int condition = dao.selectMember(id, Integer.toString(pw));
if(condition == 3) { //가입안되어 있는 케이스(해당 아이이로 가입 가능)
	int rowCnt = dao.insertMember(dto);
	if(rowCnt == 1) {
		%>
		<h1>회원가입이 성공적으로 완료되었습니다. <a href=logindb.jsp>로그인</a></h1>
	<%}
}else {
	%>
	<h1>아이디는 중복되었습니다.<a href='insertdb.jsp'>다시 회원가입</a></h1>
<% 
} // condition 2
} // request.getMethod 조건문
else if( request.getMethod().equalsIgnoreCase("get") ){
	%>
	<h1> get 방식은 지원하지 않습니다.</h1>
<% 
}
%>
</body>
</html>