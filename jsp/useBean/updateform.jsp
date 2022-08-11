<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
String regDate = sdf.format(new Date());
%>
<h1> 회원정보 수정(이름, 폰, 이메일 수정 가능합니다.)</h1>
<form action="updateprocess.jsp">
아이디:<input type=text name="id" value='<%=request.getParameter("id") %>' readonly="readonly"><br>
암호:<input type=password name="password" value='<%=request.getParameter("pw") %>' readonly="readonly"><br>
이름:<input type=text name="name"><br>
폰:<input type=text name="phone"><br>
이메일:<input type=email name="email"><br>
회원가입일:<input type=text name="regDate" value="<%=regDate%>"><br>
<input type="submit" value="전송">

</form>
</body>
</html>