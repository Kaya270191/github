<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--out 내장 객체로 오늘의 날짜 및 시각 출력 --%>
	<%
		out.println("오늘의 날짜 및 시각" + "<br>");
		out.println(java.util.Calendar.getInstance().getTime());
	
	%>

</body>
</html>