<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
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
<h1>총버퍼크기=<%=out.getBufferSize() %></h1>
<h1>남은버퍼크기=<%=out.getRemaining() %></h1>
<%
String name = request.getParameter("name");
out.println(name);
out.flush(); //버퍼 비우기
%>
<h1>남은버퍼크기=<%=out.getRemaining() %></h1>

<%=exception %>
</body>
</html>