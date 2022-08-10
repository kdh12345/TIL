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
<style>
	table, td{border:2px solid pink;
	border-collapse: collapse;}
</style>
</head>
<body>
<%
	String title = request.getParameter("title");
	if(title == null){
		title = "";
	}
	String contents = request.getParameter("content");
	if(contents == null){
		contents = "";
	}
	String writer = request.getParameter("writer");
	if(writer == null){
		writer = "";
	}
%>
<h1>게시판</h1>
<table>
	<tr>
		<td>제목</td><td><%=title %></td>
	</tr>
	<tr>
		<td>내용</td><td><%=contents %></td>
	</tr>
	<tr>
		<td>작성자</td><td><%=writer %></td>
	</tr>
</table>
</body>
</html>