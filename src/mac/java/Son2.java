package mac.java;
import window.java.*;
public class Son2 extends Parent {
	public void go() {
		System.out.println("publicVar: "+publicVar);
		System.out.println("protectedVar: "+protectedVar);
//		System.out.println("defaultVar: "+defaultVar);
		//default는 서로 패키지가 달라서 안된다
	}
	public static void main(String[] args) {
		Son2 s=new Son2();
		s.go();
	}
}
