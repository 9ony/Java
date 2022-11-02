package day03;
/*
 * java.lang.Math클래스의 주요 메서드
 * 
 * static final double	PI:원주율 (상수)
 * static int abs(int a):절대값을 반환
 * static double floor(double a): 내림값을 반환
 * static double ceil(double a) 올림값을 반환
 * static long	round(double a) or static int	round(float a) :반올림값 반환
 * static double	random() :랜던값반환
 */
public class MathTest {

	public static void main(String[] args) {
//		System.out.println(PI);
		System.out.println(Math.PI);
		int x = Math.abs(-100);
		System.out.printf("x :%d\n",x);
		double y = 12.001;
		double y2=Math.floor(y);
		double y3=Math.ceil(y);
		System.out.printf("y :%f\n",y);
		System.out.printf("y(내림값) %f\n",y2);
		System.out.printf("y(올림값) %f\n",y3);
		
		//12.456의 반올림값을 구해 출력하세요
		int z=Math.round(12.456f); //float 값을 넣었을 경우 int로 반환
		
		double z2 = Math.round(12.456);//double은 double로 반환
		System.out.printf("i :%d\n",z);
		System.out.printf("i2 :%s\n",z2);
		
		for(int i=0;i<3;i++) {
			double r=Math.random();
			System.out.println(r);
		}
		System.out.println("----------------------");
		System.out.println( Math.random() * 10 );
		/*
		[문제1] 0<= v2 <10 사이의 임의의 정수를 발생시키세요.		
		[문제2] 5<= v3 <15 사이의 임의의 정수를 발생시키세요.				
		*/
		//[1]
		int v2 = (int)(Math.random()*10);
		System.out.println(v2);
		//[2]
		int v3 = (int)(Math.random()*10)+5;
		System.out.println(v3);
		//공식 = Math.random()*범위 + 시작값
		//[3] 23~55사이의 랜던값 출력
		int v4 = (int)(Math.random()*(55-23))+23;
		System.out.println(v4);
		
		//랜덤하게 알파벳 대문자를 발생시켜 출력하세요
		char v5 = (char)(Math.random()*(('Z'+1)-'A')+'A');
		System.out.println(v5);
		System.out.println("\n-----------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print((char)(Math.random()*(('Z'+1)-'A')+'A'));
			}
			System.out.println();
		}
		System.out.println("\n-----------------");
		
	}

}
