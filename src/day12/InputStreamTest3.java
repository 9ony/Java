package day12;

import java.io.*;

public class InputStreamTest3 {

	public static void main(String[] args) throws IOException {
		// 바이트 저장 배열 만들기
		byte[] data = new byte[6];
		int n = 0, count = 0, total = 0;
		System.out.println("입력하세요=>");
		while ((n = System.in.read(data)) != -1) { // -1이 Ctrl+c임 명렁프롬프트에서 종료할때쓰는키
			// 입력받은 데이터는 data배열에 닮긴다
			// System.out.write(n); [x]
//			System.out.write(data);// ==> 쓰레기 값이 나올수 있다.
			System.out.write(data, 0, n);// (data, 0번째부터 , 배열크기 n);
			count++;// 반복문 횟수
			total += n;
		}
		System.out.println("*****************************");
		System.out.println(total + "바이트 읽음");
		System.out.println(count + "반복문횟수");
		System.out.println("*****************************");
		System.in.close();
		System.out.close();
	}
}
