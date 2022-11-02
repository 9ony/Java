package day02;
import java.util.*;
public class Ex0927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price;//리터당가격
		double w_price;//수도요금
		double TAX;//세금
		double total;//총합계
		System.out.println(
			"------------------------------\n"
			+"1. 가정용  (liter당 50원)\n"
			+"2. 상업용  (liter당 45원)\n"
			+"3. 공업용  (liter당 30원)\n"
			+"----------------------------------");
		System.out.print("메뉴번호를 고르세요!! =>");
		int select = sc.nextInt(); //메뉴번호
		switch(select) {
			case 1: price=50; break;
			case 2: price=45; break;
			case 3: price=30; break;
			default :
				System.out.println("1~3번까지만 입력해주세요.");
			return;
		}
		System.out.println("사용량(L)을 입력해주세요.");
		double liter = sc.nextDouble(); //수도량입력
		if(liter<0) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		w_price=price*liter;
		TAX=w_price*0.05;
		total=w_price+TAX;
		System.out.println("메뉴번호	: "+select);
		System.out.println("수도요금	: "+Math.round(w_price)+"원");
		System.out.println("세금   	: "+TAX+"원");
		System.out.println("총요금 	: "+total+"원");
	}
}
