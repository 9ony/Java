package day03;
/*
 * java.lang패키지 Wrapper클래스
 * --------------------------
 * 기본자료형			클래스형
 * byte				Byte
 * short			Short
 * char				Character
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * boolean			Boolean
 * --------------------------
 */

public class IntegerTest {

	public static void main(String[] args) {
		//java.lang.Integer클래스
		//final static int MAX_VALUE:정수형의 최대값
		//final static int MIN_VALUE:정수형의 최대값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		/* static String	toBinaryString(int i)
		 * static String	toHexString(int i)
		 * static String	toOctalString(int i)
		 * 
		 */
		//125의 이진수값을 반환하는 메서드를 찾아출력하세요
		System.out.println(Integer.toBinaryString(125));
		//125의 8진수값을 반환하는 메서드를 찾아출력하세요
		System.out.println(Integer.toOctalString(125));
		//125의 16진수값을 반환하는 메서드를 찾아출력하세요
		System.out.println(Integer.toHexString(125));
		
		Integer in=new Integer(120);//8버전이후 안쓰임
		//static Integer valueOf(int i);
		Integer in2=Integer.valueOf(120);
	}

}
