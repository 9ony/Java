package day09;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class SubFrame extends JFrame{
	
	
	JTextField tfR,tfG,tfB;
	JButton btApply,btClose;
	Container cp;
	JPanel p=new JPanel();
	public SubFrame() {
		super("::SubFrame::");
		setSize(200,300);
		//컨트롤+쉬프트+O 임포트자동등록
		cp=this.getContentPane();
		cp.setLayout(new GridLayout(0,1,10,10));//1열은 고정, 행은 가변적으로
		
		cp.add(tfR=new JTextField());
		cp.add(tfG=new JTextField());
		cp.add(tfB=new JTextField());
		cp.add(p);
		
		p.add(btApply=new JButton("Apply"));
		p.add(btClose=new JButton("Close"));
		
		tfR.setBorder(new TitledBorder("Red"));
		tfG.setBorder(new TitledBorder("Green"));
		tfB.setBorder(new TitledBorder("Blue"));
		
		setSize(200,300);
	}

}//////////////////
