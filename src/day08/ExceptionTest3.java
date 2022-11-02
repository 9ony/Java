package day08;

public class ExceptionTest3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			try {
				int a = 50 / (i - 3);
				System.out.println("a: " + a);
			} catch (ArithmeticException e) {
				int a = 0;
				System.out.println("a: " + a);
			}

		}

		System.out.println("The end~~");
	}

}
