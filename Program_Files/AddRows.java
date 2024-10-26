
package db_connect;
import java.sql.*;
import java.util.Scanner;
public class AddRows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll Number:");
		int rno = sc.nextInt();
		System.out.println("Student Name:");
		String sname = sc.next();
		System.out.println("Student Course:");
		String course = sc.next();
		System.out.println("Course Fees:");
		float Fees = sc.nextFloat();
		
	String inscmd = "insert into student(roll_no, sname, course, fees)values(" +rno+ ",'"+sname+"','"+course+"',"+Fees+")";
	System.out.println(inscmd);
	
		try
		{
			
		//	Connection conObj = DbConnection.GetDbConnection();
			Connection conObj = DbConnection.GetDbConnection();
			Statement stmt = conObj.createStatement();
			
			int res = stmt.executeUpdate(inscmd);
			if(res>=1)
			System.out.println("Row is added...");
			conObj.close();
		}
		catch (Exception ex)
		{
		System.out.println(ex);	
		}
		
		
	}

}
