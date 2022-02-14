<%@ page import ="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Implicit Objects</title>
</head>
<body>
	<%--request 내장 객체로 요청 http 헤어 정보값 출력하기  --%>
	
	<%   
		Enumeration en = request.getHeaderNames(); 
		while (en.hasMoreElements()){
			String headerName = (String) en.nextElement();
			String headerValue = request.getHeader(headerName);
	%>	
	<%=headerName%> : <%= headerValue%><br>
	<%
		}
	%>


</body>
</html>