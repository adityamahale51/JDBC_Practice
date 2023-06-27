package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class demo4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll no and result");
			int rn=sc.nextInt();
			Float result=sc.nextFloat();
			PreparedStatement ps=con.prepareStatement("Update studd set result=? where rollno=?");
			ps.setFloat(1, result);
			ps.setInt(2, rn);
			ps.executeUpdate();
			System.out.println("Record updated successfully");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
