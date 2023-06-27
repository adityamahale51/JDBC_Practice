package jdbcdemo;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Type;

import java.sql.*;
public class demo8 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two number");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			CallableStatement cs=con.prepareCall("{?=call mul1(?,?)}");
			cs.registerOutParameter(1, JDBCType.INTEGER);
			cs.setInt(2,n1);
			cs.setInt(3, n2);
			cs.execute();
			System.out.println("function executed...");
			System.out.println("mul="+cs.getInt(1));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
