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
public class MyGui2 extends JFrame {

	Container cp;
	JPanel rootP = new JPanel() {
		@Override
		public Insets getInsets() {
			return new Insets(100,0,0,0);
		}
	};
	JRadioButton r,g,b;
	Canvas can;
	public MyGui2() {
		super("::MyGui2::");
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
		//리스너 부착-----
		r.addItemListener(new ItemListener() { //추상화된 클래스는 new로 객체(인스턴스)화 할수없는데 이름없는
			//클래스로 만들어서 ItemListener라는 추상화된클래스(인터페이스)를 상속받는다는 느낌??
			//javascript function () => {...} 과비슷하다보면됨
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.red);
			}
		});
		b.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.blue);
			}
		});
		g.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.green);
			}
		});
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//------------------MYGui2메소드
	
	

	public static void main(String[] args) {
		MyGui2 my = new MyGui2();
		my.setBounds(700, 100, 300, 500);

		my.setVisible(true);
	}///////////////main

}//////////////MYGui2 클래스

