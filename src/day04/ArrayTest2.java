package day04;

public class ArrayTest2 {

	public static void main(String[] args) {
		//2차원 배열
		int a[][]; //(1)선언
//		int [][]a; 
//		int []a[];
		
		//(2) 메모리할당
		a=new int[3][2]; //3행 2열
		System.out.println(a[0][0]);
		// (3)초기화
		a[0][0]= 10;
		a[0][1]= 20;
		a[1][0]= 30;
		a[1][1]= 40;
		a[2][0]= 50;
		a[2][1]= 60;

		//for루프 이용해서 출력하기 -중첩for루프 이용
		//행의 크기: a.length
		//열의 크기: a[i].length
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//같은방법인데 i크기값에 
		//행의 크기:a.length
		//열의 크기:a[i].length
		//왜이렇게 되나? a는 a[]를 가르키고
		//			  a[]는 a[][]를 가르킨다.
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//한꺼번에 선언 할당 초기화하기
		short b[][]= {{10,11},{-5,-7,8},{20}};
		//[1]for 루프 이용
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		for(short []value:b) {
			for(short value2:value) {
				System.out.print(value2+"\t");
			}
			System.out.println();
		}
		
		char[][] ch=new char[3][];
		System.out.println("ch.length :"+ch.length);
		
		ch[0]=new char[2];//2열
		ch[1]=new char[4];//4열
		ch[2]=new char[3];//3열
		System.out.println("ch[0].length :"+ch[0].length);
		System.out.println("ch[1].length :"+ch[1].length);
		System.out.println("ch[2].length :"+ch[2].length);
		
		ch[0][0]='H';
		ch[0][1]='i';

		ch[1][0]='J';
		ch[1][1]='a';
		ch[2][0]='v';
		ch[2][1]='a';
		//char의 default값: '\u0000'
		//확장for루프 이용해서 출력하세요		
		for(char[] c:ch)
		{
			for(char v:c) {
				System.out.print(v);
			}
		System.out.println();
		}
		System.out.println("--------------------------");
	}
}
