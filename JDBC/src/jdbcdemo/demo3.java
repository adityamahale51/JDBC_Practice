package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("roll no,name and result");
			int rollno=sc.nextInt();
			String name=sc.next();
			Float result=sc.nextFloat();
			PreparedStatement ps=con.prepareStatement("insert into studd values(?,?,?)");
			ps.setInt(1, rollno);
			ps.setString(2, name);
			ps.setFloat(3, result);
			ps.executeUpdate();
			System.out.println("record inserted successfully");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
