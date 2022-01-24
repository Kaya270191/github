<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Directives Tag</title>
</head>
<body>
	<%--import속성: 현재 JSP 페이지에서 사용할 자바 크래스를 설정  --%>
	<%@page import ="java.util.Date" %>
	Today is <%= new Date() %>
</body>
</html>