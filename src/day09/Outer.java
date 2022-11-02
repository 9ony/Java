package day09;

public class Outer {
	int a=10;
	static int b=20;
	
	public void test() {
		Inner in=new Inner();
		Outer.Inner in2=this.new Inner();
		
		System.out.println("in.c = "+in.c);
		System.out.println("in.c2 = "+in2.c);
	}
	
	
	class Inner{
		int c=30;
		public void sub() {
			System.out.println("sub()****");
		}
	}//////
	static class SInner{
		int d=30;
		static int e=40;
		void foo() {
			System.out.println("foo()@@@@");
		}
		static void bar() {
			System.out.println("bar()####");
		}
	}////

}/////
