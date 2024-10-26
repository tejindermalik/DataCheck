package db_connect;
import java.sql.*;

public class DB_Connection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/vision","root","1234");
			if(conObj!=null) {
				System.out.println("Db Conncted...");
				}
		}
		catch(Exception e) {
			System.out.println(e);
		}
								

	

} 

}




