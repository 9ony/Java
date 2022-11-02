package day08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*btPlus, btReset버튼에 대한 이벤트처리
ActionEvent 
ActionListener상속받아 구현
btPlus-----------------------------
tf1에 입력한 값 얻어오기
tf2에 입력한 값 얻어오기

더하기하여 tf3에 보여주기

btReset------------------------
tf1,tf2,tf3에 입력한 값을 비워주기
==============================
정수값을 입력하지 않은 경우
에러발생 확인한 뒤,
==> 예외 처리하기
==>tf3에 "정수를 입력해야해요"

*/
public class MyCalc extends JFrame implements ActionListener{
	
	Container cp;
	JPanel p= new JPanel();
	JLabel lb1,lb2,lb3;
	JTextField tf1,tf2,tf3;
	JButton btPlus,btReset;
	
	public MyCalc() {
		super("::MtCalc::");
		cp=this.getContentPane();
		cp.add(p);
		p.setBackground(Color.white);
		p.setLayout(new GridLayout(4,2,10,10));
		
		lb1 = new JLabel("정수1: ",JLabel.CENTER);
		lb2 = new JLabel("정수2: ",JLabel.CENTER);
		lb3 = new JLabel("결 과: ",JLabel.CENTER);
		
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		tf3=new JTextField(20);
		
		btPlus=new JButton("Plus");
		btReset=new JButton("Reset");
		
		btPlus.addActionListener(this);
		btReset.addActionListener(this);
		p.add(lb1); p.add(tf1);
		p.add(lb2); p.add(tf2);
		p.add(lb3); p.add(tf3);
		p.add(btPlus); p.add(btReset);
		
		setBackground(Color.white);
		
		tf3.setEditable(false);//text입력 못하게
		
		setSize(300,300);
		setLocation(500,200); //x,y
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//-------------------
	@Override
	public Insets getInsets() {
		return new Insets(40,15,15,15);//바깥여백 
	}//----------------
	public void clearTf() {
		tf1.setText(null);
		tf2.setText(null);
		tf3.setText(null);
		tf1.requestFocus();
	}//-------------
	public void calc() {
		try {
			int text1 = Integer.parseInt(tf1.getText());
			int text2 = Integer.parseInt(tf2.getText());
			String result = Integer.toString(text1+text2);
			tf3.setText(result);
			}catch(NumberFormatException w) {
			String err = "정수값을 입력해주세요";
//			tf3.setText(err);
			JOptionPane.showMessageDialog(p, err);
			}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		if(obj==btPlus) {
			calc();
		}else if(obj==btReset) {
			clearTf();
		}
	}
	public static void main(String[] args) {
		MyCalc my = new MyCalc();
	}

}
