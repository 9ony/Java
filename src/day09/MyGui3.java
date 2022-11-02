package day09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui3 extends JFrame {

	Container cp;
	JPanel rootP = new JPanel();
	
	Canvas can = new Canvas();
	JButton btOpen,btExit;
	SubFrame sf;
	public MyGui3() {
		super("::MyGui3::");
		cp = this.getContentPane();
		cp.add(rootP);
		rootP.setBackground(Color.white);
		rootP.add(can);
		can.setSize(150,150);
		can.setBackground(Color.yellow);

		rootP.add(btOpen = new JButton("Open"));
		rootP.add(btExit = new JButton("Exit"));
		
		GuiHandler handler = new GuiHandler(this);
		sf = new SubFrame();
		btOpen.addActionListener(handler);
		btExit.addActionListener(handler);
		sf.btApply.addActionListener(handler);
		sf.btClose.addActionListener(handler);
		
//		btOpen.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				SubFrame sf = new SubFrame(); //여기에 생성하면 누를때마다 객체를생성함!![x]
//				sf.setVisible(true);
//			}
//		});
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//------------------MyGui3메소드

	public static void main(String[] args) {
		MyGui3 my = new MyGui3();
		my.setBounds(500, 100, 200, 300);

		my.setVisible(true);
	}///////////////main

}//////////////MyGui3 클래스
