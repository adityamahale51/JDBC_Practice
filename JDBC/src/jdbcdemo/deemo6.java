package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class deemo6 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Aditya@05");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter rollno,name,marks");
			int rn=sc.nextInt();
			String name=sc.next();
			Float result=sc.nextFloat();
			CallableStatement cs=con.prepareCall("{call procstud(?,?,?)}");
			cs.setInt(1, rn);
			cs.setString(2, name);
			cs.setFloat(3, result);
			cs.execute();
			System.out.println("stored procedure executed");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
