package day03;
/*
 * 보조제어문: break, continue;
 */
public class BreakContinue {

	public static void main(String[] args) {
		//결과를 예측하세요
		System.out.println("1------------------");
		for(int i=0;i<3;i++) {
			if(i==1) break; //반복문이탈하여 0출력
			System.out.println("i : "+i);
		}
		System.out.println("2------------------");
		for(int i=0;i<3;i++) {
			if(i==1) continue; //조건에 부합하면 아래 문장을 실행하지 않고 반복문을 계속 수행함
			System.out.println("i : "+i);
		}
		System.out.println("3.----------------");
		for (int i=0;i<3 ;i++ )
		{
			for (int k=0; k<3;k++ )
			{
				if(k==1) break;
				System.out.println("i="+i+", k="+k); //0,0 1,0 2,0
			}
		}//for--------
		System.out.println("4.----------------");
		for (int i=0;i<3 ;i++ )
		{
			for (int k=0; k<3;k++ )
			{
				if(k==1) continue;
				System.out.println("i="+i+", k="+k); //0,0 0,2 1,0 1,2 2,0 2,2
			}
		}//for--------
		System.out.println("5.----------------");
		outer: //label => 반복문 앞에 붙일수있다
		for (int i=0;i<3 ;i++ )
		{
			inner:
			for (int k=0; k<3;k++ )
			{
				if(k==1) break outer;//지정된 라벨과 가까운 반복뭄ㄴ을 이탈한다
				System.out.println("i="+i+", k="+k); //0,0 1,0 2,0
			}
		}
		System.out.println("6.----------------");
		outer: //label => 반복문 앞에 붙일수있다
		for (int i=0;i<3 ;i++ )
		{
			inner:
			for (int k=0; k<3;k++ )
			{
				if(k==1) continue outer;//지정된 라벨과 가까운 반복뭄ㄴ을 이탈한다
				System.out.println("i="+i+", k="+k); //0,0 1,0 2,0
			}
		}

	}

}
