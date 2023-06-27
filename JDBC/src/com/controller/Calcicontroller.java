package com.controller;
import java.awt.event.*;
import com.mode.calcimodel;
import com.view.calciview;
public class Calcicontroller implements ActionListener{
	calciview v;
	calcimodel m;
	public Calcicontroller(calciview v) {
		// TODO Auto-generated constructor stub
		this.v=v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==v.b1) {
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1+n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b2) {
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1-n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b3) {
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1*n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b4) {
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1/n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b5) {
			v.t1.setText(" ");
			v.t2.setText(" ");
			v.t3.setText(" ");
		}
		if(e.getSource()==v.b6) {
			v.f.dispose();
		}
	}
}