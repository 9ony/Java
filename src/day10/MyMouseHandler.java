package day10;
/*
 * 이벤트 : MouseEvent
 * 이벹느핸들러 : MouseListener
 */
import java.awt.*;
import java.awt.event.*;
public class MyMouseHandler implements MouseMotionListener,ActionListener
{
	MyPaint my;
	public MyMouseHandler(MyPaint my) {
		this.my=my;
	}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
//		my.setTitle("Drag");
		int x=e.getX();
		int y=e.getY();
		my.setTitle("x: "+x+", y: "+y);
		my.can.x=x;
		my.can.y=y;
		
		//전달된 x,y좌표가 적용되려면 캠버스를 다시 그려야한다.
		my.can.repaint();
			
	}
	/*
	 * 개발자						JVM
	 * can.repaint()===> 		can.update() ============> can.paint()
	 * 							기존의 그린 그림을				그림그리기
	 * 							모두 지우기를 한뒤에
	 */
	

	@Override
	public void mouseMoved(MouseEvent e) {
		my.setTitle("move");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o==my.bt[0]) {
			my.can.cr=Color.red;
		}else if(o==my.bt[1]) {
			my.can.cr=Color.green;
		}else if(o==my.bt[2]) {
			my.can.cr=Color.blue;
		}else if(o==my.bt[3]) {
			if(my.can.w<100) {
			my.can.w+=2;
			my.can.h+=2;	
			}
		}else if(o==my.bt[4]) {
			if(my.can.w>3) {
				my.can.w-=2;
				my.can.h-=2;	
			}
		}else if(o==my.bt[5]) {
			my.can.cr=my.can.getBackground();
		}else if(o==my.bt[6]) {
			Graphics g =my.can.getGraphics();
			g.clearRect(0, 0, my.can.getWidth(), my.can.getHeight());
		}
		
	}

}
