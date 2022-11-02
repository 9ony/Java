package window.java;

public class Son1 extends Parent{
	
	public void go() {
		System.out.println("publicVar: "+publicVar);
		System.out.println("protectedVar: "+protectedVar);
		System.out.println("defaultVar: "+defaultVar);
//		System.out.println("privateVar: "+privateVar);
//		private는 setter getter를 통해접근 가능
		
		/*
		 * private : 자기 클래스 내에서만 접근 가능
		 * 생략형    : 같은 패키지 내에서만 접근 가능
		 * protected: 같은 패키지 + 부모자식 상속관계면 접근 가능
		 * public : 어디서든 접근 가능
		 * 
		 * */

	}
	public static void main(String[] args) {
		Son1 s=new Son1();
		s.go();
	}
}
