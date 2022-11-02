package day03;
/*
 * 배열
 * - 하나의 변수에 인덱스번호를 붙여 여러개의 데이터를 저장할 수 있도록 하는 자료구조
 * - 고정크기
 * - 동종의 데이터만 저장 가능하다
 */
public class ArrayTest {

	public static void main(String[] args) {
		//[1]배열선언
		int a[];
		// int a[3] 자바는 크기와같이 못함
		//[2]크기할당
		a=new int[3];
		//[3]초기화
		a[0]=10;
		a[1]=20;
		a[2]=30;
//		a[3]=40; [x]
		System.out.printf("a[%d]=%d\n",0,a[0]);
		System.out.printf("a[%d]=%d\n",1,a[1]);
		System.out.printf("a[%d]=%d\n",2,a[2]);

		System.out.printf("a배열의크기 =%d\n",a.length);
		//[2] 선언과할당 동시에하고 초기화하는방법
		double b[]=new double[4];
		System.out.println(b[0]);
		System.out.println(b[3]);
		//배열의 경우 선언하지않으면 디폴트값이 저장되어있다
		b[0]='A';
		b[1]=30e-5;
		b[2]=20;
		b[3]=.123f;
		//b배열값 모두출력
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		//[1][2][3]: 선언과 동시에 메모리 할당 및 초기화
		char [] ch= {'J','a','v','a'};
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//확장 for루프
		// for(변수선언:자료구조){}
		for(char c:ch) {
			System.out.print(c);
		}System.out.println();
		
		//b 확장for루프로 출력
		for(double s:b) {
			System.out.println(s);
		}
	}

}
