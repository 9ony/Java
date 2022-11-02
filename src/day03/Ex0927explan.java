package day03;

import java.util.*;

public class Ex0927explan {
//	수도요금을 계산하는 프로그램을 작성해봅시다.
//	------------------------------
//	1. 가정용  (liter당 50원)
//	2. 상업용  (liter당 45원)
//	3. 공업용  (liter당 30원)
//	----------------------------------
//	[1] 위 메뉴 번호를 Scanner클래스를 통해 입력받으세요
//	[2] 사용량도 Scanner클래스를 통해 입력 받고
//	아래 결과를 출력하세요
//	출력문
//	메뉴번호: 1
//	수도요금: 5000원
//	세금 (5%) : 250원
//	총수도요금: 5250원
//	switch-case문을 이용하기

	// 사용자정의 메서드
	// [1] static메서드 (클래스 메서드) :"클래스명.메서드()" 식으로접근
	// [2]non-static메서드 (인스턴스 메서드[객체]) :객체 생성 후 "객체명.메서드()"식으로 접근
	public static void showMenu() {
		System.out.println("----------------------");
		System.out.println("1. 가정용  (liter당 50원)");
		System.out.println("2. 상업용  (liter당 45원)");
		System.out.println("3. 공업용  (liter당 30원)");
		System.out.println("----------------------");
		System.out.println("메뉴 번호를 입력하세요 =>");
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ex0927explan.showMenu();
		int num = sc.nextInt();
		if (num < 1 || num > 3) {
			System.out.println("입력오류!! 메뉴에 없는 번호에요");
			return;
		}
		System.out.println(">>사용량을 입력하세요 =>");
		int use=sc.nextInt();
		int price = 0;
		String str="";
		switch (num) {
		case 1:
			price = 50;
			str="가정용";
			break;
		case 2:
			price = 50;
			str="상업용";
			break;
		case 3:
			price = 50;
			str="공업용";
			break;
		}
		int fare=use*price;
		//int tax=fare * 0.05; //float이라 에러남
		double tax=fare * 0.05;
		
		System.out.println("----------------------");
		System.out.println("메뉴번호\t: "+num+" ("+str+")");
		System.out.println("사용량\t: "+use+" liter");
		System.out.println("수도요금\t: "+fare+"원");
		System.out.println("세금\t: "+(int)tax+"원");
		System.out.println("총수도요금\t: "+(int)(fare+tax)+"원");
		System.out.println("----------------------");
		
	}
}
