package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] atgs) {
		//데이터베이스 정보

		String host = "jdbc:mysql://192.168.0.161:3306/lsj";
		String user = "lsj";
		String pass = "1234";
		Connection conn = null;
		
		try {
			
			// 1단계 : JDBC 드라이브 로드 하기
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계 : 데이터베이스 접속
			conn = DriverManager.getConnection(host,user,pass);
			if(conn != null) {
				System.out.println("데이터 베이스 성공");
			}
			// 3단계 : SQL쿼리 실행 객치 생성
			
			
			// 4단계 : SQL 실행
			// 5단계 : ResultSet 실행 결과 처리(select문만 해당)
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 6단계 : 데이터베이스 종료
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}


