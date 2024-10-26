package db_connect;
import java.sql.*;
import java.util.*;

public class update {
			

		public static void main(String[] args) {
			 Connection conObj = DbConnection.GetDbConnection();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Roll Number : ");
				 int rno = sc.nextInt();
					try {
						
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
									
						System.out.println("Do you wish to update this record?");
						String resp = sc.next();
						if(resp.equals("Yes")) {
							System.out.println("Enter updated Name:");
							String sname = sc.next();
							System.out.println("Enter Updated Course:");
							String course = sc.next();
							System.out.println("Enter updated Fees:");
							float fees = sc.nextFloat();
							
							String upd_qry = "update student set sname = ?,course =?,fees = ? where roll_no ="+rno;
							 PreparedStatement pstmt = conObj.prepareStatement( upd_qry);
							 pstmt.setString(1,sname);
					         pstmt.setString(2, course);
					         pstmt.setFloat(3, fees);
					         pstmt.executeUpdate();
							System.out.println("Record Updated");
						}
						else {
							System.out.println("No update needed");
						}
						conObj.close();
					}
					
					catch(Exception o) {
						o.printStackTrace();
					}
			
			
											   }
					}
	
		
	


