package day02;
//import javax.swing.*;
import java.util.*;
public class IfTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.in : 키보드 입력을 받을 수 있는 입력장치와 연결된 클래스
		System.out.println("정수를 입력하세요=>");
		int num=sc.nextInt();
		System.out.println("num: "+num);
		//홀수면 Odd 짝수면 Even
		if(num%2==0 & num!=0) {
			System.out.println("Even");
		}else if(num%2!=0) {
			System.out.println("Odd");
		}else {
			System.out.println("0입니다");
		}
		System.out.println("*****************");
	}

}
