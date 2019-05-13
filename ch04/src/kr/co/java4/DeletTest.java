package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletTest {
	public static void main(String[] args) throws Exception{
		String host = "jdbc:mysql://192.168.0.161:3306/lsj";
		String user = "lsj";
		String pass = "123";
		
		// 1단계-JDBC드라이버 로드
		Class.forName("com.mysql.jdbc.Drider");
		// 2단계-데이터베이스 접속
		Connection conn = DriverManager.getConnection(host,user,pass);
		// 3단계-SQL실행객체
		Statement stmt = conn.createStatement();
		// 4단계-SQL실행
		String sql = "delete `user` set `addr`='김포' where `name`='김춘추'";
		stmt.executeUpdate(sql);
		// 5단계-결과셋 처리(select일 경우만)
		// 6단계-데이터베이스 종료
		conn.close();
		System.out.println("데이터 삭제 종료");
		
	}

}
