package day09;

public class InnerClassTest {

	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println("o.a = "+o.a);
		System.out.println("Outer.b = "+Outer.b);
		
		Outer o1=new Outer();
		Outer.Inner oi=o1.new Inner();
		System.out.println("oi.c = "+oi.c);
//		o1.a;
		oi.sub();

	}

}
