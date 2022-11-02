package day07;
//생략형 접근지정자: 같은 패키지 내에 있는 클래스들끼리 접근가능
//protected : 같은 패키지는 물론 접근 가능. 다른 패키지일지라도 상속 관계가 있으면 접근 가능
//private < 생략형 < protected < public
class Super{
	int a=10;
	int b=20;
	void func() {
		System.out.println("****");
	}
}///////////////
class Sub extends Super{
	int b=30;
	int c=40;
	
	@Override
	protected void func() {
	//부모보다 넓은 접근지정자는 지정가능
		System.out.println("$$$$$");
	}
}///////////////
public class Polymorphism2 {

	public static void main(String[] args) {
		System.out.println("1.---------------------");
		Super sp=new Super();
		System.out.println("sp.a= "+sp.a); //10
		System.out.println("sp.b= "+sp.b); //20
		sp.func();
		
		System.out.println("2.---------------------");
		Sub sb=new Sub();
		System.out.println("sb.a= "+sb.a); //10
		System.out.println("sb.b= "+sb.b); //30
		System.out.println("sb.c= "+sb.c); //40
		sb.func();
		
		System.out.println("3.---------------------");
		Super ss=new Sub();
		System.out.println("ss.a= "+ss.a); //10
		System.out.println("ss.b= "+ss.b); //20
//		System.out.println("ss.c= "+ss.c);
		ss.func();
		
	}

}
