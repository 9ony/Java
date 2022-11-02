package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*  [1] Runnable을 상속받아 스레드가 할 일을 구현하세요
 *     => MyPanel의 x좌표를 반복돌면서 증가시켜주고, 갱신된 값을 적용
 * [2] 시작,중지버튼 이벤트 처리 Anonymous class로 처리해보기
 *     시작버튼 눌렀을 때 스레드를 동작시키세요
 * */
public class MoveCircle extends JFrame implements Runnable{

	Container cp;
	JPanel rootP = new JPanel();
	MyPanel myP = new MyPanel();
	JButton btStart, btStop;
//	Thread tr = new Thread(this);
	Thread tr;
	boolean flag;
	public MoveCircle() {
		super("::MoveCircle::");
		cp = this.getContentPane();
		cp.add(rootP, BorderLayout.NORTH);
		cp.add(myP, BorderLayout.CENTER);
		rootP.setBackground(Color.white);
		
		rootP.add(btStart=new JButton("Start"));
		rootP.add(btStop=new JButton("Stop"));
		btStart.addActionListener(e->{
			flag=true;
			tr = new Thread(this);
			tr.start();
		});
//		CircleMove tr = new CircleMove();
//		Thread tr = new Thread(this);
//		Thread tr;
		/*
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = true;
				tr = new Thread(MoveCircle.this);
//				Thread tr = new Thread();
				tr.start();
			}
		});*/
		btStop.addActionListener(e->{
			flag=true;
			tr.interrupt();
		});
		/*
		btStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = true;
				tr.interrupt();
			}
		});
		*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------------
//	class CircleMove extends Thread{
//		@Override
//		public void run() {
//			while(true) {
//				myP.x++;
//				myP.repaint();
//				try {
//					Thread.sleep(100);
//					//0.5초간 잠을잔다.
//				}catch(InterruptedException e) {
//					e.printStackTrace();
//					break;
//				}
//			}
//		}
//	}
	public void run() { //thread객체.start()로실행
		while(flag) {
			myP.x++;
			myP.repaint();
			try {
				Thread.sleep(100);
				//0.5초간 잠을잔다.
			}catch(InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		MoveCircle my = new MoveCircle();
		my.setBounds(600, 100, 500, 500);
		//x, y, w, h
		my.setVisible(true);
	}//------------------------

}//class/////////////////////////////////////
