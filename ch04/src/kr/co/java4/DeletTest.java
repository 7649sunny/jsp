package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletTest {
	public static void main(String[] args) throws Exception{
		String host = "jdbc:mysql://192.168.0.161:3306/lsj";
		String user = "lsj";
		String pass = "123";
		
		// 1�ܰ�-JDBC����̹� �ε�
		Class.forName("com.mysql.jdbc.Drider");
		// 2�ܰ�-�����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		// 3�ܰ�-SQL���ఴü
		Statement stmt = conn.createStatement();
		// 4�ܰ�-SQL����
		String sql = "delete `user` set `addr`='����' where `name`='������'";
		stmt.executeUpdate(sql);
		// 5�ܰ�-����� ó��(select�� ��츸)
		// 6�ܰ�-�����ͺ��̽� ����
		conn.close();
		System.out.println("������ ���� ����");
		
	}

}
