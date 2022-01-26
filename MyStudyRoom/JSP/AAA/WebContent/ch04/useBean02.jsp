<%@ page contentType ="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="dao.Calculator" />
	<%
		int m=bean.process(5);
		out.print("5의 3제곱: "+m);
	%>

</body>
</html>