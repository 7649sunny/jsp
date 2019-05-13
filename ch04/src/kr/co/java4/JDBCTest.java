package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] atgs) {
		//�����ͺ��̽� ����

		String host = "jdbc:mysql://192.168.0.161:3306/lsj";
		String user = "lsj";
		String pass = "1234";
		Connection conn = null;
		
		try {
			
			// 1�ܰ� : JDBC ����̺� �ε� �ϱ�
			Class.forName("com.mysql.jdbc.Driver");
			// 2�ܰ� : �����ͺ��̽� ����
			conn = DriverManager.getConnection(host,user,pass);
			if(conn != null) {
				System.out.println("������ ���̽� ����");
			}
			// 3�ܰ� : SQL���� ���� ��ġ ����
			
			
			// 4�ܰ� : SQL ����
			// 5�ܰ� : ResultSet ���� ��� ó��(select���� �ش�)
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 6�ܰ� : �����ͺ��̽� ����
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}


