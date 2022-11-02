package day04;

public class JikbangApp {
	public static void main(String[] args) {
		//클래스 : 객체를 만들어내는 틀
		// 객체 : 클래슽를 통해 만들어지는 구현물
		
		House h1=new House();
		House h2=new House();
		
		h1.ownerName="홍길동";
		h1.room=3;
		h1.addr="강남구 삼성동";
		
		h2.ownerName="김철수";
		h2.room=1;
		h2.addr="강남구 역삼동";
		
		h1.printinfo();
		h2.printinfo();
		
		String a=h1.rent("매매", 30000);
		System.out.println(a);
	}
}
