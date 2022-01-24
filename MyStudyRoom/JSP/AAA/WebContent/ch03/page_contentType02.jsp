<%-- 페이지 디렉티브 태그 --%>>
<%@ page contentType="text/html; charset=utf-8" %>

<%@ page errorPage = "page_isErrorPage_error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Directives Tag</title>
</head>
<body>
	<h2>contentType 디렉티브 태그</h2>
	<h4>text/html: HTML 출력</h4>
	<h4>charset =utf-8: 문자 인코딩</h4>
	
	<% 
		String str = null;
		out.println(str.toString());
	%>

</body>
</html>