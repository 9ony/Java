package day07;

final class base{
	int a;
}

class Child{//extends Base [x]
	void foo() {
		System.out.println("foo()");
	}
	final void bar() {
		System.out.println("bar()");
	}
}//////////////////

class Demo extends Child{
	@Override
	protected void foo() {
		System.out.println("foo()###");
	}
//	@Override
//	void bar() {//부모 클래스가 final메소드라 안됨
//		System.out.println("bar()###");
//	}
}


public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
