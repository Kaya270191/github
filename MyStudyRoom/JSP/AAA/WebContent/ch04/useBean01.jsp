<%@ page contentType ="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date" />
	<p><%
		out.print("오늘의 날짜 및 시각");
		%>
	<p><%=date %>

</body>
</html>