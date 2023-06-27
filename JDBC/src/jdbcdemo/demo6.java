package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class demo6 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a roll no");
			int rn=sc.nextInt();
			CallableStatement cs=con.prepareCall("{call procstudd(?,?,?)}");
			cs.setInt(1, rn);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.execute();
			System.out.println("process executed");
			System.out.println("name of student="+cs.getString(2));
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
