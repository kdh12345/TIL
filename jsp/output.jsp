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
h2{
	text-align: center;
}
table,td {border: 2px solid blue;
border-collapse: collapse; /*선 중복 제거*/
margin: auto;
}
td{width:100px; height:50px; text-align:center; line-height: 50px;}
table  tr:nth-child(2n){
	background-color:silver;
}
table  tr:nth-child(2n+1){
	background-color:pink;
}

</style>
</head>
<body>
<%
String start = request.getParameter("start");
String end = request.getParameter("end");
if(start == null){
	start = "2";
}
if(end == null){
	end = "9";
}
int startNum = Integer.parseInt(start);
int endNum = Integer.parseInt(end);
%>
<h2>구구단 출력</h2>
<table>
<% for(int i = 1;i <= 9;i++){
	%>
	<tr>
	<% for(int j = startNum; j<=endNum;j++){
		String output = j+"*"+i+"="+(j*i);
		%>
		<td><%=output %></td>
	<% 
	}
	%>
		</tr>
	<%
}
%>
</table>
<a href='input.jsp'>구구단 입력하기</a>
</body>
</html>