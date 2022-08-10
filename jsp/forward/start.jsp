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
String id = request.getParameter("id");
String file = "";
String[] menu = null;
request.setCharacterEncoding("utf-8");
if (id != null) {
	if (id.equalsIgnoreCase("admin") || id.equals("administrator")) {
		out.println("<h1>관리자로 로그인하셨습니다.</h1>");
		file = "admin.jsp";
		menu = new String[2];
		menu[0] = "모든사용자리스트조회";
		menu[1] = "상품관리";
	} else {
		out.println("<h1>일반사용자로 입력해주세요</h1>");
		file = "user.jsp";
		menu = new String[3];
		menu[0] = "내정보조회";
		menu[1] = "로그아웃";
		menu[2] = "글쓰러가기";
	}
	request.setAttribute("menu", menu);
	%>
	<jsp:forward page="<%=file %>" />
	<!-- 문자열이나 숫자만 가능 -->
		<!-- <jsp:param value="" name=""/> -->
<%}
else {
	out.println("<h1>아이디 입력해주세요</h1>");
}
%>
</body>
</html>