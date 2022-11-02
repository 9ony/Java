package day12;
//System.out : PrintStream
//- 1byte기반 스트림
//- 노드 스트림 (콘솔하고 노드 연결)
//- print(), println(), printf()
//- write(int n)
//- write(byte[] data, int off, int len)
import java.io.*;

public class InputStreamTest2 {
	public static void main(String[] args) throws IOException {
		int n = 0, count = 0;
		System.out.println("입력하세요 =>");
		while ((n = System.in.read()) != -1) { // -1이 Ctrl+c임 명렁프롬프트에서 종료할때쓰는키
//			System.out.print(n);
//			System.out.print((char)n);//아스키코드 문자로 형변환
			System.out.write(n);// wirte는 입력받은 문자그대로 출력 한글도됨!
			count++;
		}
		System.out.println("*****************************");
		System.out.println(count + "바이트 읽음");
		System.out.println("*****************************");
		System.in.close();
	}
}
