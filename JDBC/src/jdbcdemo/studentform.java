package jdbcdemo;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class studentform extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	java.sql.ResultSet rs;
	public studentform(){
		setLayout(new FlowLayout());
		l1=new JLabel("Roll no");
		l2=new JLabel("name");
		l3=new JLabel("result");
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		b1=new JButton("first");
		b2=new JButton("next");
		b3=new JButton("previous");
		b4=new JButton("last");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(l1);  add(t1);
		add(l2);  add(t2);
		add(l3);  add(t3);
		add(b1);        
		add(b2);
		add(b3);        
		add(b4);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member","root","Aditya@05");
		    Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		    rs=stat.executeQuery("select * from members");
		    if(rs.next()) 
		    	display();
		    
		

		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		setSize(400,400);
		setVisible(true);
			
	}
	public void display() 
	{
		try {
			t1.setText(String.valueOf(rs.getInt(1)));
			t2.setText(rs.getString(2));
			t3.setText(String.valueOf(rs.getInt(3)));
		}
		catch(Exception e) {
			System.out.println(e);
		}}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		try {
			if(obj==b1) {
				if(rs.isFirst());
				{
					rs.first();
					display();
				}
			}
			else if(obj==b2) {
				if(rs.next())
					display();
			}
			else if(obj==b3) {
				if(!rs.isFirst()) {
					rs.previous();
					display();
				}
			}
			else if(obj==b4) {
				if(!rs.isLast()) {
					rs.last();
					display();
				}
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		studentform s=new studentform();

	}
	}
	
	
	
