package day02;

public class Primitive3 {

	public static void main(String[] args) {
		print("1.문자형--------");
		//문자형: char타입 (2byte-16bit) : 0 ~ 2^16-1 (0 ~ 655535)
		//		자바는 유니코드 체계를 사용함(모든 국가의 언어 표현 가능)
		char ch1='가';
		char ch2='A';//ascii코드값:65
		print("ch1="+ch1);
		print("ch2="+ch2);
		char ch3='\uff57';//유니코드
		print("ch3="+ch3);
		print("ch2+1="+(ch2+1));//char형에 +1하면 아스키코드값을 반환한다.
		/*char + int => 큰 자료유형으로 자동형변환(promotion)이 일어난다.
		 * 
		 * int 보다 작은 유형의 데이터가 연산에 사용이되면
		 * 자동으로 int유형으로 형변환이 된다.
		 * ex)
		 * byte------+
		 * short-----+--------->int
		 * char------+
		 */
		
		byte b1=10;
		byte b2=20;
		int b3=b1+b2;
		print("b3="+b3);
		
		byte b4=(byte)(b2-b1); //byte- btye=> int 프로모션됨
		byte b5=(byte)128;
		print("b4="+b4);
		print("b5="+b5); //-128
		/*
		 *    128
		 *     64 ... 0
		 *     32 ... 0
		 *     16 ... 0
		 *      8 ... 0
		 *      4 ... 0
		 *      2 ... 0
		 *      1 ... 0
		 *      
		 *       128: 00000000 00000000 00000000 10000000   <=int형
		 * (byte)128: 10000000 
		 * */
		char c='A';
		char d=(char)(c+1);
		print("d="+d); //B
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
}
