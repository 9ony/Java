package day02;
import java.util.*;
public class IfTest2 {

	public static void main(String[] args) {
		// 2자리 정수를 입력 받으세요.
		// 11,22,33,44,55,...
		// ==> "OK 10의자리와 1의 자리가 같아요"
		//그렇지 않다면 "No 10의 자리와 1의 자리가 달라요"
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 정수를 입력 받으세요.");
		int num = sc.nextInt();
		if(num>10 && num<100){
			if(num%10==num/10){
			System.out.println("OK 10의자리와 1의 자리가 같아요");
			}else {
			System.out.println("No 10의 자리와 1의 자리가 달라요");
			}
		}else {
			System.out.println("2자리정수를 입력하세요");
			return; //main 종료함
		}
		//위를 삼항연산자로 출력 
		System.out.println((num%10==num/10) ? "OK 10의자리와 1의 자리가 같아요":"No 10의 자리와 1의 자리가 달라요");
	}
}
