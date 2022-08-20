<%@page import="springmvc.HelloDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%ArrayList<HelloDTO> dtos = (ArrayList<HelloDTO>)request.getAttribute("model"); %>

<%for(int i=0; i< dtos.size();i++){
	%>
	<h3><%=dtos.get(i).getMessage() %></h3>
<%
}
%>
<c:forEach items="${model }" var="dto">
	<h3>${dto.message }</h3>
</c:forEach>

</body>
</html>