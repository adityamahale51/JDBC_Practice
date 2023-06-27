package com.view;
import java.awt.Button;
import java.awt.Color;
import java.awt.color.*;
import javax.swing.*;

import com.controller.Calcicontroller;
public class calciview {
	public JFrame f;
	public JLabel l1,l2,l3,l4; 
	public JTextField t1,t2,t3;
	public JButton b1,b2,b3,b4,b5,b6;
	public calciview()
	{
	  f=new JFrame("calculator");
	  l1=new JLabel("1st no");
	  t1=new JTextField();
	  l2=new JLabel("2st no");
	  t2=new JTextField();
	  b1=new JButton("+");
	  b2=new JButton("-");
	  b3=new JButton("*");
	  b4=new JButton("/");
	  l3=new JLabel("Result");
	  t3=new JTextField();
	  b5=new JButton("Reset");
	  b6=new JButton("cancel");
	  l4=new JLabel();
	  l1.setBounds(10, 10, 100, 40);
	  t1.setBounds(120, 10, 100, 40);
	  l2.setBounds(10, 60, 100, 40);
	  t2.setBounds(120, 60, 100, 40);
	  b1.setBounds(10, 110, 50, 40);
	  b2.setBounds(70, 110, 50, 40);
	  b3.setBounds(130, 110, 50, 40);
	  b4.setBounds(190, 110, 50, 40);
	  l3.setBounds(10, 160, 100, 40);
	  t3.setBounds(120, 160, 100, 40);
	  b5.setBounds(30, 210, 100, 40);
	  b6.setBounds(150, 210, 100, 40);
	  f.getContentPane().setBackground(Color.yellow);
	  b1.addActionListener(new Calcicontroller(this));
	  b2.addActionListener(new Calcicontroller(this));
	  b3.addActionListener(new Calcicontroller(this));
	  b4.addActionListener(new Calcicontroller(this));
	  b5.addActionListener(new Calcicontroller(this));
	  b6.addActionListener(new Calcicontroller(this));
	  f.add(l1);f.add(t1);f.add(l2);f.add(t2);
	  f.add(b1);f.add(b2);f.add(b3);f.add(b4);
	  f.add(l3);f.add(t3);f.add(b5);f.add(b6);
	  f.add(l4);
	  f.setSize(300,300);
	  f.setVisible(true);
	  f.setLayout(null);
	  
	}

}
