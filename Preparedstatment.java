package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedstatment {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		String Sql="insert into Student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(Sql);
		ps.setInt(1, 14);
		ps.setString(2, "Dyano");
		ps.setString(3,"pune");
		ps.execute();

	}

}
