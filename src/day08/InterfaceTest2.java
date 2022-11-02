package day08;
interface Inter1{
	void a();
	int b();
}
interface Inter2{
	double pi=3.14;
}
//interface가 interface를 상속받을때 extends 사용 여러개가능
interface Inter3 extends Inter1, Inter2{
	void c();
}
abstract class AbsClass{
	abstract void d();
}
class MyDemo extends AbsClass implements Inter3 
{
	public void a() {
		System.out.println("inter1 a()");
	}
	public int b() {
		return 1;
		
	}
	public void c() {
		double d = Inter2.pi;
		System.out.println("inter3 c()"+"inter2 pi :"+d);
	}
	public void d() {
		System.out.println("AbsClass d()");
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDemo my = new MyDemo();
		my.a();
		System.out.println("Inter3 :"+my.b());
		my.c();
		my.d();
		
		Inter1 im=new MyDemo();
		Inter2 im2=new MyDemo();
		Inter3 im3=new MyDemo();
		AbsClass ac=new MyDemo();
		
		im.a();
		System.out.println(im.b());
		//im.c();[x]
		
		System.out.println(Inter2.pi);
		System.out.println(MyDemo.pi);
//		MyDemo.pi=7;[x]
		
		im3.a();
		System.out.println(im3.b()+3);
		im3.c();
		
		((MyDemo)im3).d();
		
	}

}
