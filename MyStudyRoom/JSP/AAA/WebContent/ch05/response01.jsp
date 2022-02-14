<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Implicit Objects</title>
</head>
<body>
<%--response 내장 객체로 페이지 이동하기  --%>
	<form action="response01_process.jsp" method="post">
		<p> 아이디: <input type= "text" name="id">
		<p> 비밀번호: <input type= "text" name="passwd">
		<p> <input type= "submit" value="전송">
	</form>

</body>
</html>