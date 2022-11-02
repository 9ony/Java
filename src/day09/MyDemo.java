package day09;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDemo extends JFrame{

	 Container cp;
	 JPanel rootP=new JPanel();
	public MyDemo() {
		super("::MyDemo::");
		cp=this.getContentPane();
		cp.add(rootP);
		rootP.setBackground(Color.white);
		
	}//------------------mydemo메소드

	public static void main(String[] args) {
		MyDemo my=new MyDemo();
		my.setBounds(700,100,500,500);
		
		my.setVisible(true);
	}///////////////main

}//////////////mydemo 클래스
