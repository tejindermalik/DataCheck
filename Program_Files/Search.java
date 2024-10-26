package db_connect;
import java.sql.*;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rno = sc.nextInt();
		
		try
		{
			Connection  conObj = DbConnection.GetDbConnection();
			Statement stmt = conObj.createStatement();
			ResultSet  rs = stmt.executeQuery("Select * from Student  where roll_no=" + rno);
			
			if(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("roll_no"));
				System.out.println("Student Name : " + rs.getString("sname"));
				System.out.println("Student Course : " + rs.getString("course"));
				System.out.println("Course Fees : " + rs.getFloat("fees"));
			}
			else
				System.out.println("Student Not Exist with given roll number");
						
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
