package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String url="jdbc:mysql://localhost:3307/db1";
		String user="root";
		String password="root";
		String driver="com.mysql.cj.jdbc.Driver";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("Select * from univ_entity");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	}

}
