<%@ page contentType ="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>action tag</title>
</head>
<body>
	<%
		String title = request.getParameter("title");
	%>
	<h3><%=java.net.URLDecoder.decode(title) %></h3>
	Today is :<%=request.getParameter("date") %>

</body>
</html>