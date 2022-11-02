package day03;

import javax.swing.JOptionPane;

public class Ex0928quiz2 {

	public static void main(String[] args) {
		String value=JOptionPane.showInputDialog
				("입력하세요");
		char ch = ' ';
		boolean isNumber = true;
		for(int i=0; i<value.length(); i++) {
			ch=value.charAt(i);
			System.out.print(ch);
			if(ch<'0'|ch>'9') {
				isNumber=false;
			}
		}
		System.out.println();
		if(isNumber) System.out.println(value+"는숫자입니다.");
		else System.out.println(value+"는숫자가아닙니다.");
	}

}
