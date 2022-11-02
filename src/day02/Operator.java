package day02;

public class Operator {

	public static void main(String[] args) {
		print("1.부호 연산자(+,-)");
		byte a=5;
		byte b=-7;
		print("+a: +"+(+a));
		print("+b: +"+(-a));
		print("2.증갑연산자(++,--");
		int c =8;
		long d=5;
		c++;
		d--;
		print("c: "+c);
		print("d: "+d);
		++c;
		--d;
		print("c: "+c);
		print("d: "+d);
		
		float e=5.6f;
		double f=8.4;
		System.out.println(++e);
		System.out.println("e: "+e++);
		System.out.println(f++);
		System.out.println("f: "+f++);
		
		print("3.비트별 not연산자(~)*************");
		int m=42;
		print("m: "+m);
		print("m: "+(~m));
		//비트로 바꾸어서 연산해야함
		//0은 1로, 1은 0으로 바꾼다
		/*
		 * 42
		 * 21...0
		 * 10...1
		 * 5 ...0
		 * 2 ...1
		 * 1 ...0
		 * 
		 *  42	: 00000000 00000000 00000000 00101010
		 * ~42	: 11111111 11111111 11111111 110101015
		 * 
		 * -1*2^31 + 2^30 + 2^29.......
		 * 
		 * 1010101
		 * -1*2^6 + 2^4 + 2^2 + 1 = -64 + 16 + 4 + 1 = -43
		 */
		
		//음수를 비트로 표현하는 방법 : java는 2의 보수를 취한다
		//2의 보수란? 1의 보수를 구한 값에 +1을 한다.
		//		5    : 00000000 00000000 00000000 00000101
		//5의 1의 보수 : 11111111 11111111 11111111 11111010
		// 위에 의 1의보수에 +1 = 2의보수  
		//5의 2의 보수 : 11111111 11111111 11111111 11111011 ===> -5
		
		print("4. 논리부정 연산자: !*************");
		//논리식에서만 적용!
		boolean b1=false;
		print("b1: "+b1);
		print("!b1: "+(!b1));
		
		/*
		 * =   : 대입연산
		 * ==  : 비교연산자
		 * === : 자바에는없음!! (자바스크립트에선 자료형도같고 갑도같은것)
		 * [1] 기본자료형 : 값이 같은지를 비교함
		 * [2] 참조형 : 주소값이 같은지를 비교한다
		 */
		int x=5;
		float y=5.0f;
		print("x==y: "+(x==y));
		
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		/*
		 * 참조유형은 주소값을 비교한다.
		 * s2는 참조유형이기 때문에 주소값이 같냐고 물어보면 false이다.
		 * 참조유형은 heap이라는 메모리에 저장되어 값을같아고 메모리에 저장되는 위치가 다르다.
		 */
		print("s1==s2: "+(s1==s2));
		print("s1==s3: "+(s1==s3)); 
	}
	public static void print(String str) {
		System.out.println(str);
	}

}
