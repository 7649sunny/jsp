package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) throws Exception{
		
		String host = "jdbc:mysql://192.168.0.161:3306/lsj";
		String user = "lsj";
		String pass = "1234";
		
		// 1�ܰ�-JDBC����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		// 2�ܰ�-�����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		// 3�ܰ�-SQL���ఴü?????????????
		Statement stmt = conn.createStatement();
		// 4�ܰ�-SQL����????????
		String sql = "update `USER` set `addr`='����' where `name`='������'";
		
		stmt.executeUpdate(sql);
		
		// 5�ܰ�-����� ó��(select�� ��츸)
		// 6�ܰ�-������ ���̽� ����
		conn.close();
		System.out.println("������ ������Ʈ �Ϸ�");
		
	}

}
