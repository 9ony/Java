package day09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//JButton, JTextField => ActionEvent
//JRadioButton ==> ItemEvent  ==> ItemListener
/*이벤트핸들러 구성하는 방법
* [1] 컴포넌트를 가진 클래스가 이벤트핸들러가 되는 방법
* [2] 이너 클래스로 구성하는 방법
* 		- 이너 멤버 클래스
*      - 이름없는 로컬 클래스
* [3] 외부 클래스로 구성하는 방법
* */
public class MyGui extends JFrame {

	Container cp;
	JPanel rootP = new JPanel();
	JRadioButton r,g,b;
	Canvas can;
	public MyGui() {
		super("::MyGui::");
		cp = this.getContentPane();
		cp.add(rootP);
		rootP.setBackground(Color.white);
		
		r=new JRadioButton("Red");
		g=new JRadioButton("Green",true);
		b=new JRadioButton("Blue");
		
		rootP.add(r);
		rootP.add(g);
		rootP.add(b);
		
		r.setBackground(Color.white);
		g.setBackground(Color.white);
		b.setBackground(Color.white);
		
		ButtonGroup group=new ButtonGroup(); //3개를 그룹화해서 셋중에하나만선택가능
		group.add(r);
		group.add(g);
		group.add(b);
		
		can=new Canvas();//도화지 클래스=>컴포넌트=> 사이즈주고 배경색을 주어야 확인가능
		rootP.add(can);
		can.setSize(200,200);
		can.setBackground(Color.GREEN);
		
		MyEventHandler handler=new MyEventHandler();
		//inner클래스에 이벤트핸들러를 만들면 클래스객체를 생성해서 버튼에 추가해줌 밑에처럼
		r.addItemListener(handler);
		g.addItemListener(handler);
		b.addItemListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//------------------MyGui메소드
	
	class MyEventHandler implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object o = e.getSource();
			if(o==r) {
				can.setBackground(Color.red);
			}else if(o==g) {
				can.setBackground(Color.green);
			}else if(o==b) {
				can.setBackground(Color.blue);
			}
		}
	}//inner class
	

	public static void main(String[] args) {
		MyGui my = new MyGui();
		my.setBounds(700, 100, 300, 500);

		my.setVisible(true);
	}///////////////main

}//////////////MyGui 클래스

