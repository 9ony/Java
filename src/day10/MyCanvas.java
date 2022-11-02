package day10;

import java.awt.*;

public class MyCanvas extends Canvas {
	int x=50;
	int y=50;
	Color cr=Color.blue;
	int w=7;
	int h=7;
	@Override
	public void paint(Graphics g) {
		g.setColor(cr);
//		g.drawOval(x, y, w, h); //원
		g.fillOval(x, y, w, h); //꽉찬원
	}
	@Override
	public void update(Graphics g) {
		//update를 안하고 paint(g)를 바로호출해서 지웟다 그렷다 반복작업을 안함!
		paint(g);
	}
	public MyCanvas() {
	}

}
