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
		int count = 3; //���� : ��������, ���� �޼ҵ� ���� 
		
		String makeItLower(String data){
			return data.toLowerCase();
	} %>
	
	<%
		for(int i=1; i<= count; i++) { //��ũ��Ʋ��: �ڹ� ���� �ڵ� �ۼ� 
		out.println("java server page "+i+".<br>");
		}
	%>
	
	
	<%= makeItLower("hello world") //ǥ����:����, ����, �޼ҵ� ȣ�� ����� ���ڿ� ���·� ��� 
	%> 



</body>
</html>