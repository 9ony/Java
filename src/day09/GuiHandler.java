package day09;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
//이벤트 핸들러를 외부로 작성하는 경우
/*- 인자 생성자를 구성해서 같이 연동할 객체를 전달받는다
* - 멤버변수에 전달하고
* - 멤버변수로 핸들링한다
* */
/*[1] Close버튼 누르면 SubFrame만 닫기도록 처리

[2] Apply버튼 누르면 tfR, tfG, tfB에 입력한 값 얻어와서
Color객체를 생성한뒤
can에 적용
*/



public class GuiHandler implements ActionListener
{
	MyGui3 my;
	public GuiHandler(MyGui3 my) {
		this.my=my;
	}
	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o==my.btOpen) {
			my.sf.setLocation(my.getLocation().x+my.getSize().width,my.getLocation().y);
			my.sf.setVisible(true);
		}else if(o==my.btExit) {
			System.exit(0);
		}else if(o==my.sf.btApply) {
			try {
				int r = Integer.parseInt(my.sf.tfR.getText());
				int g =Integer.parseInt(my.sf.tfG.getText());
				int b = Integer.parseInt(my.sf.tfB.getText());
				Color cr=new Color(r,g,b);
				my.can.setBackground(cr);
				}catch(IllegalArgumentException h) {
					JOptionPane.showMessageDialog(my.cp, "정수로 0~255사이로 입력해주세요.");
					my.sf.tfR.setText(null);
					my.sf.tfG.setText(null);
					my.sf.tfB.setText(null);
					my.sf.tfR.requestFocus();
				}
		}else if(o==my.sf.btClose) {
			my.sf.dispose();
		}
		
	}
}