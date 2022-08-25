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
$(document).ready(function(){
	$("#deletebtn").on('click', function(ev){
		var pw = prompt("암호를 입력하세요");
		if(pw == ${seqList.pw}){
			location.href="boarddelete?seq="+${seqList.seq};
		}else{
			alert("글쓰기 암호가 일치하지 않습니다.");
		}
	}); // #deletebtn
	
	$("#updatebtn").on('click', function(ev){
		var pw = prompt("암호를 입력하세요");
		if( pw == ${seqList.pw} && ${sessionid} != null ){
			location.href="boardupdate?seq="+${seqList.seq};
		}else{
			alert("글쓰기 암호가 일치하지 않거나 로그인하지 않았습니다. 확인하세요.");
		}
	}); // #deletebtn
	
});
</script>
</head>
<body>
<h1>선택한 게시물 정보는 다음과 같습니다.</h1>
<table border=3>
	<tr><td>번호</td><td>${seqList.seq }</td>
	<tr><td>제목</td><td>${seqList.title }</td>
	<tr><td>내용</td><td>${seqList.contents }</td>
	<tr><td>작성자</td><td>${seqList.writer }</td>
	<tr><td>조회수</td><td>${seqList.viewcount }</td>
	<tr><td>작성시간</td><td>${seqList.writingtime }</td>
	<tr><td colspan=2>
	<input type="submit" value="수정" id="updatebtn">&nbsp;
	<input type="submit" value="삭제" id="deletebtn">
	</td>
</table>



</body>
</html>