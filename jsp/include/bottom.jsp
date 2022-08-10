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
<img src="/html/images/images/html5.jpg">
<h3>연락처 - 이메일로 문의하세요.</h3>
<h4>위치 - 서울시 강남구 역삼동 </h4>
<% if(request.getParameter("id") != null){%>
	<%=request.getParameter("id") %> 회원님 xx에 관심 있으신가요?
	<%=request.getParameter("file") %>에 포함되어있습니다.
<% 
}%>
</body>
</html>