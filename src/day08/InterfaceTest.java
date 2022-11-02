package day08;

interface MyInter{
	void foo();//public abstract가 자동으로 붙는다
}
interface YourInter{
	String STR="Hi";
	String bar();
}

//인터페이스를 상속받을 때는 implements로 받는다
class MyClass implements MyInter, YourInter
{
	public void foo() {
		System.out.println("foo()");
	}
	public String bar() {
		return "bar()";
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInter mi=new MyClass();
		mi.foo();
//		mi.bar();//[x]
		String s=((MyClass)mi).bar();
		System.out.println(s);
		System.out.println(((YourInter)mi).bar());
		
		MyClass mc=new MyClass();
		mc.foo();
		System.out.println(mc.bar());
		
		//yourinter타입의 변수 선언하고
		//foo bar STR출력
		YourInter yi=new MyClass();
		String S2=yi.bar();
		String S3=yi.STR;
		System.out.println(S2);
		System.out.println(S3);
		((MyClass)yi).foo();
		
	}
}