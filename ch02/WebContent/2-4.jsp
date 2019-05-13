<%@page import="kr.co.ch02.SmartPhone"%>
<%@page import="kr.co.ch02.Computer"%>
<%@page import="kr.co.ch02.Account"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UFT-8">
	<title>2-4</title>
</head>
	<body>
		<h3>4.클래스</h3>
		
		
		<%
		Account kb = new Account("국민은행","11-30-202030","김유신",10000);		
		Account sh = new Account("신한은행","11-56-536989","감춘추",50000);
		
		kb.deposit(20000);
		kb.withdraw(7000);
		kb.info(out);
		
		sh.deposit(15000);
		sh.withdraw(5000);
		sh.info(out);
		
		Computer com = new Computer("Intel i7","16GB","1TB");
		int rs =com.calc(5,7);
		com.internet(out);
		
		SmartPhone iphone = new SmartPhone("A7","4GB","128GB","아이폰 7s","010-999-9999");
		iphone.internet(out);
		
		SmartPhone gallaxy = new SmartPhone("A7","4GB","128GB","갤럭시 s10","010-8888-9999");
		iphone.internet(out);
		//다형성
		
		
		%>
		<p>컴퓨터 계산 결과:<%= com.calc(5,7) %></p>
		<p>아이폰 계산 결과:<%= iphone.calc(5,7) %></p>
		<p>아이폰 계산 결과:<%= iphone.calc(5,7,true) %></p>
		<p>아이폰 계산 결과:<%= iphone.calc(5,7,false) %></p>
		<p>갤럭시 계산 결과:<%= gallaxy.calc(5,7) %></p>
		<p>갤럭시 계산 결과:<%= gallaxy.calc(5,7,true) %></p>
		<p>갤럭시 계산 결과:<%= gallaxy.calc(5,7,false) %></p>
		
	</body>
</html>