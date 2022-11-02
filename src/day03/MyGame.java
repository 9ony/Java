package day03;

import java.util.*;

public class MyGame {
	public static void startGame() {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int dap= (int)(Math.random()*100+1);
		while(i<8) {
			if(i==7) {System.out.printf("게임종료"); return;}
			System.out.printf("총 7번의 기회중 %d번째 입니다\n",i);
			System.out.print("1~100사이의 정수를 입력하세요 :");
			int answer= sc.nextInt();
			if(dap==answer) {
				System.out.println("정답입니다.");
				break;
			}
			if(answer < dap) System.out.println("수를 높여보세요");
			else if(answer > dap) System.out.println("수를 낮춰보세요");
			i++;
		}
	}

	public static void main(String[] args) {
		re:
		startGame(); //클래스명. 생략
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 재시작 2번 종료 수입력 :");
		int restart = sc.nextInt();
//		switch(restart){
//			case 1: do{break re;}while(false);
//			case 2: return;
//		}
		
	}

}