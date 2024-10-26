package db_connect;
import java.sql.*;

public class DbConnection {
	
		public static Connection GetDbConnection()
		{
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vision","root","1234");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return con;
		}
}
