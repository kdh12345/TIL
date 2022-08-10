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
<h1>게시물 리스트를 보여드립니다.</h1>
<% if(request.getParameter("id") != null){ %>
	<%=request.getParameter("id") %> 회원님 xx에 관심 있으신가요?
<%
}
%>
<jsp:include page="bottom.jsp" />
</body>
</html>