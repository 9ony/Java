package pong.app;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class MyJoinPanel extends JPanel{
	
	JTextField jtfName,jtfTel;
	JPasswordField jtfPwd;
	JButton btnSubmit,btnHome;
	public MyJoinPanel() {
		this.setLayout(null);
		jtfName=new JTextField(20);
		jtfPwd=new JPasswordField(20);
		jtfTel=new JTextField(20);
		btnSubmit=new JButton("Submit");
		btnHome=new JButton("Home");
		jtfName.setBounds(90,100,200,50);//w,h
		jtfPwd.setBounds(90,170, 200,50);
		jtfTel.setBounds(90, 240, 200, 50);
			      		//x,y      w, h
		btnSubmit.setBounds(90,300,100,50);
		btnSubmit.setBackground(new Color(123,123,200));//r,g,b
		btnSubmit.setBorder(new LineBorder(Color.gray,3));
		btnHome.setBounds(190,300,100,50);
		
		jtfName.setBorder(new TitledBorder("Name"));
		jtfPwd.setBorder(new TitledBorder("Password"));
		jtfTel.setBorder(new TitledBorder("Tel"));
		
		this.add(jtfName);
		this.add(jtfPwd);
		this.add(jtfTel);
		this.add(btnSubmit);
		this.add(btnHome);
		
	}

}
