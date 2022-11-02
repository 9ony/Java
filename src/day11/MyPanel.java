package day11;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class MyPanel extends JPanel{
	int x=50, y=130,w=70, h=70;
	Color cr=Color.blue;
	
	public MyPanel() {
		//int r = (int)(Math.random()*256+0);
		Random ran = new Random();
		int r = ran.nextInt(256)+0; //랜덤객체로 생성
		int g = ran.nextInt(256);
		int b = ran.nextInt(256);
		cr=new Color(r,g,b);
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(cr);
		g.fillOval(x, y, w, h);
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
