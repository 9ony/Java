package pong.app;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MyHomePanel extends JPanel{
	JLabel jlName,jlTel;
	JButton btnEdit,btnLogout;
	String name="";
	String tel="";
	public MyHomePanel() {
		this.setLayout(null);
		jlName = new JLabel(name+"님 반갑습니다");
		jlTel = new JLabel(tel);
		btnEdit = new JButton("Edit");
		btnLogout = new JButton("Logout");
		
		
		jlName.setSize(200,50);//w,h
		jlName.setLocation(90, 100);//x,y
		jlTel.setBounds(90,170, 200,50);
					//x,y w, h
		btnEdit.setBounds(90,280,100,50);
		btnEdit.setBackground(new Color(123,123,200));//r,g,b
		btnEdit.setBorder(new LineBorder(Color.gray,3));
		btnLogout.setBounds(190,280,100,50);
		btnLogout.setBackground(new Color(90,240,240));//r,g,b
		btnLogout.setBorder(new LineBorder(Color.gray,3));
		
		jlTel.setBorder(new TitledBorder("Telephone"));
		
		this.add(jlName);
		this.add(jlTel);
		this.add(btnEdit);
		this.add(btnLogout);
	}
	

}
