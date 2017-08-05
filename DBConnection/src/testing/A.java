package testing;

import java.io.StringBufferInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from customers where customerNumber='496'");
		while(rs.next())
		{
			System.out.println(rs.getString("contactLastName"));
		}
		
		
	}
	
}
