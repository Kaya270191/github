<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page errorPage ="page_errorPage_error.jsp" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- page info : JSP 페이지 설명위한 설정  --%>>
	<%@ page info = "Date 클래스를 이용한 날짜 출력하기" %>
	Today is <%= new java.util.Date() %>
	
	<%
		String str = null;
		out.println(str.toString());
	%>
	

</body>
</html>