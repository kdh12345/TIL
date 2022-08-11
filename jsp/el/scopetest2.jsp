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
<%=pageContext.getAttribute("a") %><br>
<%=request.getAttribute("a") %><br>
<%=session.getAttribute("a") %><br>
<%=application.getAttribute("a") %><br>
<hr>
현재페이지에서전달=${a }<br>
이동전의 페이지에서 에서전달=${request.a }<br>
세션에서전달=${session.a }<br>
application에서전달=${application.a }<br>

</body>
</html>