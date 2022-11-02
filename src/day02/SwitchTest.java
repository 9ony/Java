package day02;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		//월을 입력하세요
		//일수를 알려주는 프로그램
		/*
		 * switch(변수|수식){
		 * 	case 값1: 실행문; break;
		 * 	case 값2: 실행문; break;
		 * 	case 값3: 실행문; break;
		 * 	default: 실행문;
		 * 31일=1,3,5,7,8,10,12
		 * 30일=4,6,9,11
		 * 28일=2
		 */
		
		int moon = Integer.parseInt(JOptionPane.showInputDialog("월을 숫자만 입력하세요"));
		if(moon<1 || moon>12) {
			System.out.println("정확한 월을 입력해주세요");
			return;
		}
		switch(moon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(moon+"월은 31일 입니다");
			break;
		case 2:
			System.out.println(moon+"월은 28일 입니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(moon+"월은 30일 입니다");
			break;
		}

		
		
		String month = JOptionPane.showInputDialog("월을 입력하세요");
		int m = Integer.parseInt(month);
		int d;
		if((m<=7&&m%2==1)||(m>=8&&m%2==0)) {
			d=31;
		}else if(m==2) {
			d=28;
		}else {
			d=30;
		}
		System.out.println(m+"월은"+d+"일 입니다");
	}
}
