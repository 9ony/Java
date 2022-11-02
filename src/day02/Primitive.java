package day02;
import java.lang.*;
public class Primitive {
	//main 메소드 설명
	//public static : modifier(지정자,제한자,한정자)
	//void : 반환타입을 지정하는 부분에 void를 기술하면 반환값이 없다는 의미
	//String[] : 문자열 유형의 배열타입
	static public void main(String a[]) 
	{
		System.out.println("1.정수형-----------------");
		// byte<short<int[*]<long
		byte bt1=-128; //1btye (8bit) : -128 ~ 127
		byte bt2=127;
		System.out.println("bt1="+bt1);
		System.out.println("bt2="+bt2);
		
		short st=2^15;//2byte(16bit) : -2^15 ~ 2^15-1
		System.out.println("st="+st);
		
		int it=250000;//4byte(32bit) : -2^31 ~ 2^31-1
		//정수형의 디폴트
		
		long ln1=40; //8byte(64bit): -2^63 ~ 2^63-1
		long ln2=40L; //뒤에 접미사 L, l 을 붙인다.
		//Ctrl+Alt+방향키아래 : 현재 커서 내용을 복붙.
		
		System.out.println("ln1="+ln1);
		System.out.println("ln2="+ln2);
		
		int i=1000000000;//0이 9개
		long j=10000000000l;//0이 10개 long으로 선언해도 int로잡아서 L을붙인다.
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		int d =0xaf;//16진수 수앞에 0x접두사가 들어간다
		System.out.println("d="+d);
		System.out.println(getNum());
	}
	public static int getNum() {
		int getN=100;
		return getN;
	}
}
