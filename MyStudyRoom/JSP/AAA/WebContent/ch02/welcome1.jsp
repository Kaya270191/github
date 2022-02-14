<%--페이지 디렉티브 태그 --%>
<%@ page contentType="text/html; charset=utf-8" %> <%--contentType:JSP가 생성할 문서의 콘텐츠 유형을 설정  --%>
<%@ page import = "java.util.Date" %> <%--import: JSP페이지가 사용할 자바클래스 설정 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel = "stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>

<body>

<%--인클루드 디렉티브 태그: JSP 특정영역에 외부파일 내용을 포함 --%>
<%@ include file = "menu1.jsp" %> 


<%--선언문 %! : 자바 변수나 메소드 정의 --%>
	<%! String greeting = "Welcome to Web Shopping Mall";
		String tagline = "Welcome to Web Market!"; %>
		
	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3">
				<%--표현문 %=: 변수,계산식, 메소드 호출 결과를 문자열 형태로 출력  --%>
				<%= greeting %> 
			</h1>
		</div>
	</div>
	
	<main role = "main">
	<div class = "container">
		<div class = "text-center">
			<h3>
				
				<%=tagline %>
				<%--스크립틀릿 %: 자바 로직 코드 작성에 사용  --%>
				<%
					Date day = new java.util.Date();
					String am_pm;
					int hour = day.getHours();
					int minute = day.getMinutes();
					int second = day.getSeconds();
					if (hour/12 ==0){
					am_pm = "AM";
					} else {
						am_pm="PM";
						hour = hour -12;
						}
					String CT = hour + ":" + minute +":"+second+" " +am_pm;
					out.println("현재 접속 시각: "+CT+"\n");
				%>
			</h3>
		</div>
		<hr>
	</div>
	</main>
	
	
<%--인클루드 디렉티브 태그: JSP 특정영역에 외부파일 내용을 포함 --%>
<%@ include file ="footer1.jsp" %>

</body>
</html>