<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function(){});
</script>
</head>
<body>
<h1> 글쓰기 폼 </h1>
<form action="boardupdate" method=post>
번호:<input type=text name="seq" value=${updated_board.seq } readonly="readonly"><br>
제목:<input type=text name="title" value=${updated_board.title }><br>
내용:<textarea rows=10 cols=100 name="contents">value=${updated_board.contents }</textarea><br>
작성자:<input type=text name="writer" value=${sessionid } readonly ><br>
조회수:<input type=text name="viewcount" value=${updated_board.viewcount } readonly ><br>
글암호:<input type=hidden name="pw" value=${updated_board.pw }><br>
<input type=submit value="수정">
</body>
</html>