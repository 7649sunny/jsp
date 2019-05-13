<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UFT-8">
	<title>2-3</title>
</head>
	<body>
	<h3>3.반복문</h3>
	<%
	int sum = 0;
	for (int i=0;i<=10;i++){
		
		sum+=i;
	}
	%>
	<p>1부터 10까지의 합:<%= sum %></p>
	<h4>별삼각형 출력</h4>
	<%
	 for(int a=1;a<=10;a++){
		 for(int b=1;b<=a;b++){
			 out.print("★");
		 }
		 out.print("<br/>");
	 }
	 %>
	<%
	 for(int c=10;c>=1;c--){
		 for(int d=1;d<=c;d++){
			 out.print("★");
		 }
		 out.print("<br/>");
		 
		 }
	 %>
	 
 	<h4>구구단</h4>
 	<table border="1">
 	<tr>
 	<%
 	for(int a=2;a<10;a++){ 	
 	%>
 	<td><%=a %>단</td>
 	<%
 	}
 	%>
 	</tr>
 	<%
 	for(int i=1;i<10;i++){
 	%>
 	<tr>
 	<%
 	for(int j=2;j<10;j++){
 		int c=j*i;
 	%>
 	<td><%=j %>x<%=i %>=<%=c %></td>
 	<%
 	}
 	%>
 	</tr>
 	<%
 	}
 	%>
 	
 
 	
 	</table>
	
	
	</body>
</html>