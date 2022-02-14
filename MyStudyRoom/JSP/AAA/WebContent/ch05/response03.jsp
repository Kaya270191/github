<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--response 내장 객체로 오류 응답 코드와 오류 메시지 보내기 --%>
	<%
		response.sendError(404, "요청 페이지를 찾을 수 없습니다. ");	
	%>

</body>
</html>