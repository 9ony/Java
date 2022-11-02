package day03;

import java.util.Scanner;

public class Ex0928quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i =sc.nextInt();
		int sum=0;
		
		while (i > 0) {
			sum += i % 10; //나머지값 더하기
			i /= 10; //i를 10으로나눔
		}
		System.out.println("더한값은 ="+sum);
	}

}
