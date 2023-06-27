package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll no");
			int rollno=sc.nextInt();
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from studd where rollno="+rollno);
			if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			else {
				System.out.println("data not found");
				rs.close();
				con.close();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
