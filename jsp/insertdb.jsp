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
	$('form').on('submit', function(ev){
		var pw = $('#pw').val();
		if(isNaN(pw)){
			alert("í¨ì¤ìëë ì«ìë§ ê°ë¥í©ëë¤.");
			ev.preventDefault();
		}
	});
});
</script>
</head>
<body>
<form action="insertdbprocess.jsp" method="post">
ìì´ë<input type=text name="id" required="required"><br>
ìí¸<input type=password name="pw" required="required" id="pw"><br>
ì´ë¦<input type=text name="name"><br>
í°<input type=text name="phone" pattern="010[0-9]{4}[0-9]{4}"><br>
ì´ë©ì¼<input type=email name="email"><br>

<input type="submit" value="íìê°ì">
</form>
</body>
</html>