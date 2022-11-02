package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyEngine extends JFrame implements ActionListener {
	Container cp;
	JPanel p;
	JButton[] bt;
	String str[]= {"Naver","Google","Daum","Yahoo"};

	public MyEngine() {
		super("::MyEngine::");
		cp=this.getContentPane();
		cp.add(p=new JPanel());
		p.setLayout(new GridLayout(2,2,10,10));
		//2행 2열 수평수직 10,10
		//버튼 4개생성
		//버튼이벤트처리
		cp.add(p);
		p.setBackground(Color.white);
		bt=new JButton[4];
		for(int i=0;i<bt.length;i++) {
			bt[i] = new JButton(str[i]);
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // 이벤트가 어디서발생됫는지 주소값을 가져옴
		if(obj==bt[0]) {
			bt[0].setBackground((bt[0].getBackground()!=Color.red)? Color.red:null);
		}else if (obj == bt[1]) {
			bt[1].setBackground((bt[1].getBackground()!=Color.green)? Color.green:null);
		}else if (obj == bt[2]) {
			bt[2].setBackground((bt[2].getBackground()!=Color.blue)? Color.blue:null);
		}else if (obj == bt[3]) {
			bt[3].setBackground((bt[3].getBackground()!=Color.cyan)? Color.cyan:null);
		}
	}
	//JFrame의 바깥 여백을 주는 메서드 재정의
		@Override
	public Insets getInsets() {
		Insets in=new Insets(42,20,20,20);//top, left, bottom, right
		return in;
	}//-------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEngine my=new MyEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}
}
