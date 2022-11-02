package day02;

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("2항 연산자------------");
		System.out.println("5. 산술연산자(+,-,*,/,%)");
		int x=3;
		int y=5;
		
		System.out.println(y/x);// 1
		System.out.println(y%x);// 2
		System.out.println("6. 비트연산자(&,|,^)");
		System.out.printf("%d & %d = %d%n",x,y,(x&y));//1
		System.out.printf("%d | %d = %d%n",x,y,(x|y));
		System.out.printf("%d ^ %d = %d%n",x,y,(x^y));

		//-10을 비트로 바꾸세요
		//양수 10 	:00000000 00000000 00000000 00001010
		//1의 보수	:11111111 11111111 11111111 11110101 
		//     +1:  :11111111 11111111 11111111 11110110
		
		//-10>>3    :11111111 11111111 11111111 11111110
		//-10<<3 	:11111111 11111111 11111111 10100111
		//-10>>>3	:00011111 11111111 11111111 11111110
		
		System.out.println(-10>>3);
		System.out.println(-10<<3);
		System.out.println(-10>>>3);
		/*
		 * Shift 연산자
		 * 1) <<	:왼쪽으로 비트수만큼 이동,
		 * 			:오른쪽에 남은 빈칸은 부호비트 채움
		 * 1) >>	:오른쪽으로 비트수만큼 이동,
		 * 			:왼쪽에 남은 빈칸은 부호비트 채움
		 * 1) >>>	:오른쪽으로 비트수만큼 이동,
		 * 			:오른쪽에 남은 빈칸은 0으로 채움
		 */
		System.out.println("논리연산잔(&,&&,|,||)-------");
		/* 1) &
		   2) |
		   : 앞의 연산으로 결과를 알 수 있어도 뒤의
		     문장까지 비교한다.
			
        3) &&
		   4) ||
		   : &&의 경우 앞의 연산 결과가 false라면
		     뒤의 연산을 생략한다.
			 ||의 경우는 앞의 연산결과가 true라면
			 뒤의 연산을 생략한다.
		
			 [문제1] 다음 출력 결과를 예측하세요
		*/
		int m=50, n=60;
		if((m>n) & (m>0)) {
			System.out.println("###");
		}else if((n>m) | (n<0)) {
			System.out.println("@@@");
		}
		if((m>n) && (m>0)) {
			System.out.println("####");
		}else if((n>m) | (n<0)) {
			System.out.println("@@@@");
		}
		//[1]
		int i=1;
		int j=i++;
		System.out.println("i="+i+"j="+j);
		if((i>++j) & (i++ ==j)) {
			i=i+j;
		}
		System.out.println("i="+i);
	}

}
