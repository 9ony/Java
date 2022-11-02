package day07;
import java.awt.*;
import javax.swing.*;
//JFrame : Window계열의 컨테이너 ==> 내부에 contentPane 이라는 컨테이너가 별도로 있다.
//JButton을 JFrame에 붙일 예정 => contentPane을 얻어와서 여기에 붙이자.
public class MyGui extends JFrame{
	JButton b1,b2,b3,b4;
	Container cp;
	Icon icon1, icon2,icon3;
	JTextField tf1;
	JTextArea ta1;
	JCheckBox c1,c2,c3;//Java, HTML, CSS
	JRadioButton r1,r2;
	public MyGui() {
		super("::MyGui v1.1:::"); //title
		cp=this.getContentPane(); //내용물들(컴포넌트)을 붙일 수 잇는 패널(Panel)
		//창닫기 처리 메서드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//icon 생성
		icon1=new ImageIcon("images/icon1.JPG");
		icon2=new ImageIcon("images/icon2.JPG");
		icon3=new ImageIcon("images/icon3.JPG");
		
		//button 생성
		b1=new JButton("Home");
		b2=new JButton(icon1);
		b3=new JButton("로그인", icon2);
		b4=new JButton("Help", icon3);
		b2.setBackground(Color.white);
//		b2.setOpaque(true);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b3.setHorizontalTextPosition(JButton.CENTER);
		b3.setVerticalTextPosition(JButton.BOTTOM);
		b3.setPressedIcon(icon3);
		
		
		tf1 = new JTextField("",40);
		ta1 = new JTextArea("안녕~",7,40);
		JScrollPane sp=new JScrollPane(ta1);//스크롤바 패널을 생성해서 ta1(JTextArea)을 붙인다
		
		c1 = new JCheckBox("Java");
		c2 = new JCheckBox("HTML",true);
		c3 = new JCheckBox("CSS",icon3,true);
		
		//컨텐트페인의 디폴트레이아웃 -> BorderLayout(동,서,남,북,중앙)
		//레이아웃 설정
		//cp.add(붙일 객체);
		
		cp.setLayout(new FlowLayout());//물흐르듯이 레이아웃
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		
		cp.add(b4);
		cp.add(tf1);

		cp.add(sp);//contentPane에 JScrollPane을 붙인다
		
		cp.add(c1);
		cp.add(c2);
		cp.add(c3);
		
		r1=new JRadioButton("남자");
		r2=new JRadioButton("여자",true);
		cp.add(r1);
		cp.add(r2);
		
		
		
		
	}

	public static void main(String[] args) {
		MyGui my=new MyGui();//JFrame은 사이징하고 setVisible(true)줘야 확인가능
		my.setSize(500,500);//width,height
		my.setVisible(true);//jframe나오려면 필수!
	}

}
