package day08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			for(int i=1; i<5;i++) {
				int a=50/(i-3);
				System.out.println("a: "+a);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("에러감지");
		}
		System.out.println("The end~~");
	}

}
