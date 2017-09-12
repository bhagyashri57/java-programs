package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class test {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		String sql="insert into student values(7,'dnyaneshwari','Goa')";
		Statement smt=con.createStatement();
		smt.execute(sql);
		
	}

}
