package day03;

import java.util.*;

public class Ex0928quiz3 {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("********MyGame v1.1**********");
			System.out.println("1.가위 2.바위 3.보 9.종료");
			System.out.println("*************************");
			System.out.print("메뉴중 입력하세요 =>");
			String[] select = { "가위", "바위", "보" };
			int com = (int) (Math.random() * 3 + 1);
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			int result = answer - com;
			String str = "";
			if (result != 0) {
				if (answer == 1) {
					if (result == -2) {
						str = "이겼어요";
					} else {
						str = "졌어요";
					}
				} else if (answer == 2) {
					if (result == 1) {
						str = "이겼어요";
					} else {
						str = "졌어요";
					}
				} else if (answer == 3) {
					if (result == 1) {
						str = "이겼어요";
					} else {
						str = "졌어요";
					}
				} else if (answer == 9) {
					System.out.println("byebye~");
					return;
				} else
					str = "1,2,3,9중에 하나만 입력하세요";
			} else
				str = "비겼어요!";
			if(answer==1||answer==2||answer==3) {
				System.out.println("당신\t :" + answer + select[answer - 1]);
				System.out.println("컴퓨터\t :" + com + select[com - 1]);
				}
			System.out.println(str);
		}
	}

}
