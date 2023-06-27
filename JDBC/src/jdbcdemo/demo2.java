package jdbcdemo;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
public class demo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a name");
			String nm=sc.next();
			PreparedStatement ps=con.prepareStatement("select * from studd where name=?");
			ps.setString(1, nm);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}
			else {
				System.out.println("record not found");
				
			}
			rs.close();
			con.close();
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}


