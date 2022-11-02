package day02;

public class Operator3 {

	public static void main(String[] args) {
		System.out.println("--조건연산자(삼항연산자)------");
		/*
		 * 변수선언문=(조건식)?값1:값2
		 * 조건식이 true면 값1을 변수에대입
		 * 			false면 갑2에 대입
		 */
		int a = 5, b=6;
		int result=(a<6)? a:b;
		System.out.println("result: "+result);
		
		String s=(a>b)? a+"":String.valueOf(b);
		System.out.println("s= "+s);
		
		System.out.println("연산후 대입연산자(할당연산자----------");
		
		int i=3;
		i+=5;//i=i+3
		System.out.println("i: "+i);//8
		i*=3;//i=i*3
		System.out.println("i: "+i);//24
		i^=3;
		System.out.println("i: "+i);//27
		i%=2;
		System.out.println("i: "+i);//1
		i-=7;
		System.out.println("i: "+i);

	}

}
