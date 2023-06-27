package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter a roll no");
			int rn=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("delete from studd where rollno=?");
			ps.setInt(1, rn);
			ps.executeUpdate();
			System.out.println("Record updated successfully");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
