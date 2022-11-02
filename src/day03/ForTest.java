package day03;

public class ForTest {

	public static void main(String[] args) {
		//[1]for루프 이용해서 1~10까지의 합과 곱을 구해 출력하세요
		int sum=0; //합계
		int max=1; //곱
		for(int i=1; i<=10;i++) {
			sum+=i;
			if(i<10) {
			System.out.printf(" %d +",i);
			}else {
				System.out.printf(" %d =%d\n",i,sum);
			}
		}
		for(int i=1; i<=10;i++) {
			max*=i;
			if(i<10) {
			System.out.printf("%d *",i);
			}else {
				System.out.printf("%d =%d\n",i,max);
			}
		}
		System.out.println("-----------------------------------");
		//[2] 1~20까지 정수 중 2 또는 3의 배수가 아닌 수를
				//출력하고, 이 수들의 총합을 구하세요.
		int qotn=0;
		for(int i=1;i<21;i++) {
			if((i%2!=0)&&(i%3!=0)) {
				qotn+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("합계는"+qotn);
		System.out.println("-----------------------------------");
		//[3] 1~100까지 정수를 다음과 같은 식으로
		//	계산한 수식과 결과값을 출력하세요
		//	1 + (-2) + 3+(-4)+5 +(-6) ....+(-100) = 결과값
		int snwjr=0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				System.out.printf(" (-%d) +",i);
				snwjr-=i;
			}
			else {
				System.out.printf(" "+i+" +");
				snwjr+=i;
			}
		}
		System.out.println("합계는"+snwjr);
		System.out.println("-----------------------------------");
		//[4] 알파벳 출력
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n-----------------------------------");
		//[5] 1+(1+2)+(1+2+3)....
		int sum2=0;
		int sum3=0;
		for(int i=1; i<11 ;i++) {
			sum2+=i;
			sum3+=sum2;
		}
		System.out.println(sum3);
	}

}
