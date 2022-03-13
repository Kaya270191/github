<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--out 내장 객체로 폼 페이지에서 아이디와 비밀번호 전송받아 출력하기 --%>
<%--폼 태그에 내용을 담아 out2_process.jsp 파일로 전달  --%>
	<form action="out2_process.jsp" method="post"> 
		<p> 아이디: <input type="text" name ="id"> 
		<p> 비밀번호: <input type="text" name ="passwd">
		<p> <input type ="submit" value="전송" />
	</form>

</body>
</html>