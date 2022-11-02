package day03;

public class DoWhileTest {

	public static void main(String[] args) {
		/*
		 * do{반복실행문자;증감식;}while(조건식);
		 * while과는 다르게 do~while은 false라도 
		 * do를 한번은 실행하고 루프를 벗어남 
		 */
		int a=5;
		do {
			System.out.println("Hello: "+a);
			//a-=10;
			a++;
		}while(a<0);
		System.out.println("The End~~~~");
	}

}
