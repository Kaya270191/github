<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Scripting Tag</h2>
	<%! 
		int count = 3; //선언문 : 전역변수, 전역 메소드 선언 
		
		String makeItLower(String data){
			return data.toLowerCase();
	} %>
	
	<%
		for(int i=1; i<= count; i++) { //스크립틀릿: 자바 로직 코드 작성 
		out.println("java server page "+i+".<br>");
		}
	%>
	
	
	<%= makeItLower("hello world") //표현문:변수, 계산식, 메소드 호출 결과를 문자열 형태로 출력 
	%> 



</body>
</html>