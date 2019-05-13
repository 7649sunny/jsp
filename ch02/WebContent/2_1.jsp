<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UFT-8">
	<title>2-1</title>
</head>
	<body>
		<h3>1.변수</h3>
		<% 
		
		//스크립트릿: jsp페이지에 java코드가 실행되는 영역
		int var1 = 1;
		boolean var2 = true;
		float var3 = 0.123456789f;
		double var4 = 0.123456789;
		char var5 = '가';
		String var6 = "안녕";
		%>
		
		<p>
		var1 : <% System.out.println(var1); %><br/> 
		var2 : <% out.println(var2); %><br/>
		var3 : <%= var3 %><br/>
		var4 : <%= var4 %><br/>
		var5 : <%= var5 %><br/>
		var6 : <%= var6 %><br/>
		
		</p>
	</body>
</html>