<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- response 내장 객체로 5초마다 JSP 페이지 갱신하기  --%>
	<p>이 페이지는 5초마다 새로고침 됩니다.
		<%
			response.setIntHeader("Refresy", 5);
		%>
	<p> <%= (new java.util.Date()) %>


</body>
</html>