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
pageContext.setAttribute("a", "page공유");
request.setAttribute("a", "request공유");
session.setAttribute("a", "session공유");
application.setAttribute("a", "application공유");

%>

<jsp:forward page="scopetest2.jsp" />
</body>
</html>