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
String id = request.getParameter("id");
%>
<h1><%=id %>회원님 로그인 하셨습니다.</h1>
<h1>내 정보 조회</h1>
<jsp:include page="bottom.jsp">
	<jsp:param value="login.jsp" name="file"/>
</jsp:include>

</body>
</html>