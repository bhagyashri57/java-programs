package Oracle;

public class OracleTest {
	package mysqlconnection;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	import com.mysql.jdbc.ResultSet;

	public class OracleTest {
		public static void main(String[] args) throws Exception {
			Class.forName("com.Oracle.jdbc.Driver.OracleDriver");
			
			try(Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","root","root");Statement smt=con.createStatement();)
			{
			String sql="insert into student values(8,'dnyaneshwari','Goa')";
			
			smt.execute(sql);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	

}
