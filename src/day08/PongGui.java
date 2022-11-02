package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGui extends JFrame implements ActionListener{

	Container cp;
	JPanel p2;
	MyLoginPanel p1;
	CardLayout card;
	public PongGui(){
		cp=this.getContentPane();//default=> BorderLayout
		cp.setLayout(card=new CardLayout());//카드레이아웃 설정
		p1=new MyLoginPanel();
		p2=new JPanel();
		

		cp.add(p1,"login");
		cp.add(p2,"home");
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.pink);
		
//		card.show(cp,"home");
		p1.btnLogin.addActionListener(this);
		
		this.setSize(400,600);
		this.setLocation(1000,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		Object obj= e.getSource();
		String str=p1.tfName.getText();
		if(obj==p1.btnLogin) {
				if(login(str)[1].equals("1")) {
					card.show(cp, "login");
				}else {
				JOptionPane.showMessageDialog(p1,login(str)[0]);
				}
		}
	}
	public String[] login(String name) 
//	throws NotSupportedNameException
	{
		//퐁씨 성이면 "환영합니다. 퐁길동님"
		if(name.startsWith("퐁")) {
			String[] result ={"환영합니다~~"+name+"님!!","1"};
			return result;
		}else if(name.startsWith("콩")) {
		//콩씨 성이면 "콩씨는 절대로 안돼!!" 사용자정의 예외를 발생시키기
			try {
			throw new NotSupportedNameException(name+"님은 콩씨라 절대로 안돼!");
			}catch(NotSupportedNameException e) {
				String[] result ={e.getMessage(),"0"};
				return result;
			}
		}else {
		//기타 성이면 "기타 성씨분들은 이용에 제한이 있어요" 사용자정의 예외를 발생시키기
			try {
			throw new NotSupportedNameException("기타 성씨분들은 이용에 제한이 있어요");
			}catch(NotSupportedNameException e) {
				String[] result ={e.getMessage(),"1"};
				return result;
			}
		}
	}
	public static void main(String[] args) {
		new PongGui();
	}

}
