package day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyAnimation extends JFrame {

	Container cp;
	JPanel rootP = new JPanel();
	MyImagePanel imgP;
	JButton btStart,btStop;
	Toolkit toolkit;
	Image img;
	public MyAnimation() {
		super("::MyAnimation::");
		
		toolkit=Toolkit.getDefaultToolkit();
		img=toolkit.getImage("images/T0.gif");
		
		imgP=new MyImagePanel();
		imgP.setImg(img);
		cp = this.getContentPane();
		cp.add(rootP, BorderLayout.NORTH);
		cp.add(imgP);
		
		rootP.add(btStart=new JButton("START"));
		rootP.add(btStop=new JButton("STOP"));
		rootP.setBackground(Color.white);
		ButtonHandler handler = new ButtonHandler();
		btStart.addActionListener(handler);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//------------------MyAnimation메소드
	class MyThread extends Thread{
		public void run() {
			//반복문 돌면서
			int i=0;
			while(true){
				i%=10;
				i++;
				img=toolkit.getImage("images/T"+i+".gif");
				imgP.setImg(img);
				imgP.repaint();
				try {
					Thread.sleep(100);
					//1초간 잠을잔다.
					//1/1000초단위
					//==> block상태가 된다 (sleep()/IO작업시)
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			MyThread my = new MyThread();
			if(o==btStart) {
				my.start();
			}
		}
	}
	public static void main(String[] args) {
		MyAnimation my = new MyAnimation();
		my.setBounds(700, 100, 500, 500);

		my.setVisible(true);
	}///////////////main
}//////////////MyAnimation 클래스

