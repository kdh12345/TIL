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
<%-- <%
String name = request.getParameter("name");
String age  = request.getParameter("age");
int intAge = -1;
if(name == null || name.equals("")){
	name ="";
}
if(age != null && !age.equals("")){
	intAge = Integer.parseInt(age);
}

<c:set var="name" value="<%=name %>"/>
<c:set var="age" value="<%=intAge %>"/>

<c:if test='${!name.equals("") && age != -1 }'>
	<c:if test="${age >= 20 }">
		<h1>${name }님 성인인증되셨습니다.</h1>
	</c:if>
	<c:if test="${age >= 17 && age <= 19 }">
		<h1>${name }님 고등학생입니다.</h1>
	</c:if>
	<c:if test="${age >= 1 && age <17 }">
		<h1>${name }님 미성년입니다.</h1>
	</c:if>
	<c:if test="${age < 1  }">
		<h1>잘못된 나이입니다.</h1>
	</c:if>
</c:if>
<c:if test='${name.equals("") || age == -1 }'>
	<h1>필요한 데이터를 입력해주세요</h1>
	<a href="login.jsp">로그인</a>
</c:if>
--%>

<c:set var="isName" value="${empty param.name }"/>
<c:set var="isAge" value="${empty param.age }"/>

<c:if test="${isName || isAge} ">
	<h1>필요한 데이터를 입력해 주세요.</h1>
</c:if>


<c:if test="${!isName && !isAge} ">
	<c:if test="${param.age >= 20 }">
		<h1>${param.name }님 성인인증되셨습니다.</h1>
	</c:if>
	<c:if test="${param.age >= 17 && param.age <= 19 }">
		<h1>${param.name }님 고등학생입니다.</h1>
	</c:if>
	<c:if test="${param.age >= 1 && param.age <17 }">
		<h1>${param.name }님 미성년입니다.</h1>
	</c:if>
	<c:if test="${param.age < 1  }">
		<h1>잘못된 나이입니다.</h1>
	</c:if>
</c:if>
<c:if test="${!isName && !isAge }">
	<c:choose>
		<c:when test="${param.age >= 20 }">
			<h1>${param.name }님 성인인증되셨습니다.</h1>
		</c:when>
		<c:when test="${param.age >= 17 && param.age <= 19 }">
			<h1>${param.name }님 고등학생입니다.</h1>
		</c:when>
		<c:when test="${param.age >= 1 && param.age <17 }">
			<h1>${param.name }님 미성년입니다.</h1>
		</c:when>
		<c:otherwise>
			<h1>잘못된 나이입니다.</h1>
		</c:otherwise>
	</c:choose>
</c:if>
</body>
</html>