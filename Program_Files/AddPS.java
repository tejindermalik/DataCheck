package db_connect;
import java.sql.*;
import java.util.Scanner;
public class AddPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll Number: ");
		int rno = sc.nextInt();
		System.out.println("Student Name:");
		String sname = sc.next();
		System.out.println("Student Course:");
		String course = sc.next();
		System.out.println("Course Fees:");
		float fees = sc.nextFloat();
		
		try
		{
			Connection conObj = DbConnection.GetDbConnection();
			java.sql.PreparedStatement ps = conObj.prepareStatement("Insert into student(roll_no, sname, course, fees) values(?,?,?,?)");
			
			ps.setInt(1, rno);
			ps.setString(2, sname);
			ps.setString(3, course);
			ps.setFloat(4, fees);
			
			int res = ps.executeUpdate();
			
			if(res>=1)
				System.out.println("Row is Added...");
			conObj.close();
		}
		catch(Exception ex)
		{
			
		}
	}

}
