package jdbcdemo;
import java.sql.*;
public class demo9 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member","root","Aditya@05");
			PreparedStatement ps=con.prepareStatement("select * from members");
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("Total cols="+rsmd.getColumnCount());
			System.out.println("name of col="+rsmd.getColumnClassName(3));
			System.out.println("Datatype of column="+rsmd.getColumnTypeName(1));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
