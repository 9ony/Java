package day08;
//
//CLI	: Command Line Interface
//GUI	: Graphic User Interface
//Window계열: JFrame=>독립적
//Panel 계열: JPanel=>비독립적
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//[1]
/*이벤트 처리 절차
 * [1] import java.awt.event.*;
 * [2] XXXListener 인터페이스를 상속받는다 (ActionListener)
 * [3] 추상메서드를 오버라이딩한다. (빈블럭으로) => 이벤트 처리 메서드
 * [4] 이벤트소스에 리스너를 붙인다. addXXXListener()메서드 이용
 * 		=> b1.addActionListener(핸들러객체)
 * [5] 오버라이딩한 메서드에 이벤트 처리코드를 구현
 * */

public class MyGui extends JFrame implements ActionListener//[2]
{
	Container cp;
	JPanel p;
	JButton b1,b2,b3;
	public MyGui() {
		super("::MyGui::");
		cp=this.getContentPane();
		p=new JPanel();
		cp.add(p);
		p.setBackground(Color.WHITE);
		b1=new JButton("red", new ImageIcon("images/icon2.JPG"));
		b2=new JButton("green", new ImageIcon("images/icon3.JPG"));
		b3=new JButton("blue", new ImageIcon("images/icon1.JPG"));
		//단축키
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		//창닫기처리
		b1.addActionListener(this);//[4]
		b2.addActionListener(this);//[4]
		b3.addActionListener(this);//[4]
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource(); //이벤트가 어디서발생됫는지 주소값을 가져옴
		if(obj==b1) {
			p.setBackground(Color.red);
		}else if(obj==b2) {
			p.setBackground(Color.green);
		}else if(obj==b3) {
			p.setBackground(Color.blue);
		}
		
	}
	
	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
