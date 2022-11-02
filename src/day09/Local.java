package day09;

public class Local {
	String str="$$$";//멤버변수
	void demo() {
		/*final*/ String lstr="###";//지역변수 => 로컬이너클래스에서 사용하려면 final변수여야한다 그러므로 값변경X (final이 생략되어잇음!!!)
		System.out.println("str: "+str);
		System.out.println("lstr: "+lstr);
//		LocalInner l = new LocalInner();
//		l.print();
		class LocalInner{
			int no=100;
			void print() {
				System.out.println("--LocalInner's print()-----");
				System.out.println("no: "+no);
				System.out.println("str: "+str);
				System.out.println("lstr: "+lstr);
//				lstr="값을변경해볼까?";
			}
		}////////////////
		LocalInner li = new LocalInner();
		li.print();
		
	}/////demo()----------
	public static void main(String[] args) {
		Local c = new Local();
		c.demo();
		
//		LocalInner li = new LocalInner();
//		li.print();
		//메소드안에 생성된 클래스는 다른메소드에서 호출할수 없다 그래서 
	}

}//Local---------------
