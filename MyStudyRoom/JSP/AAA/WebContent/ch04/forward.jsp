<%@ page contentType ="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>param 태그 연습해볼래 </h2>
	<p> 연습중 프린트 되니?</p>
	<jsp:include page="forward_date.jsp">
		<jsp:param name="date" value="<%=new java.util.Date()%>" />
	

	</jsp:include>
	<p> java server page </p>
	
	
	
</body>
</html>