package day10;
import javax.swing.*;
import java.awt.*;

public class MyImagePanel extends JPanel{
	Image img;
	int x=130, y=100;
	public MyImagePanel() {
		this.setBackground(Color.white);
	}
	public void setImg(Image img) {
		this.img=img;
	}
	public Image getImg() {
		return img;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(img!=null) {
			g.drawImage(img, x, y, this);
		}
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
