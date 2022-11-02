package day07;
//부모클래스: Super Class,Base class
//상속받을때는 extends를 이용한다.
//자바는 단일 상속이다. extends로 상속받는 클래스는 1개만 가능하다.
class Human{
	String name;
	int height;
	public Human(String name, int height) {//인자 생성자
		this.name = name;
		this.height = height;
	}
	public String showInfo() {
		return "이 름: "+name+"\n키  : "+height+"\n";
	}
}/////////////////

//자식 클래스: Sub Class, Derived class
//Superman is a Human : "is a"관계를 살펴보자
//상속관계가 잇을 대 메서드 오버라이딩이 가능함
//부모가 가진 메서드를 그냥 ㅆ느ㅡㄴ 것이 아니라
//다시 정의해서 구현하는 것
/*오버라이딩의 조건
 * [1] 메서드 이름은 부모와 동일하게
 * [2] 매개변수도 부모와 동일하게
 * [3] 반환타입도 동일하게
 * [4] 접근지정자는 부모와 동일하거나 더 넓은 범위를 지정해야 한다.
 * */

class Superman extends Human{
	int power;
	public Superman() {
		super("슈퍼맨",100);
		power=50;
		//super(); //부모의 기본 생성자 호출
	}
	public Superman(String n, int h, int p) {
		super(n,h); 
		power=p;
	}
	public Superman(String n, int h) {
		super(n,h);
	}
	//오버라이딩(Overriding) : 메서드 재정의
	@Override
	public String showInfo() {
//		return "이 름: "+name+"\n키  : "+height+"\n초능력: "+power+"\n";
		return super.showInfo()+"초능력: "+power+"\n";
	}
	//Overload
	public void showInfo(String title) {
		System.out.println(title);
		System.err.println(this.showInfo());
	}
	//초능력을 충전하는 showInfo()오버로드하기
	public void showInfo(String title,int pw) {
		System.out.println(title);
		this.power=pw;
		System.out.println(super.showInfo()+"초능력: "+power+"\n");
	}
}/////////////////
class Aquaman extends Human{
	double speed;
	public Aquaman(String n, int h, double p) {
		super(n,h);
		speed=p;
	}
	@Override 
	public String showInfo() {
//		return "이 름: "+name+"\n키  : "+height+"\n스피드: "+speed+"\n";
		return super.showInfo()+"스피드: "+speed+"\n";
	}
	
}
public class inheritance {
	public static void main(String[] args) {
		//Human객체 생성후 메서드로 정보 출력하기
		Human h1 = new Human("홍길동",182);
		h1.name="아무개";
		h1.height=166;
		System.out.println(h1.showInfo());
		
		//Superman 생성 메서드 호출
		Superman s1 =new Superman("슈퍼맨",180,300);
		System.out.println(s1.showInfo());
		
		//Aquaman 생성 메서드 호출
		Aquaman a1 =new Aquaman("인어공주",175,46.8);
		System.out.println(a1.showInfo());
		
		Superman s2 = new Superman("울트라슈퍼맨",166,800);
		System.out.println(s2.showInfo());
		s1.showInfo("######슈퍼맨정보#########");
		s1.showInfo("*****슈퍼맨정보*******",150);

		
		Human people[]= {h1, s1, a1, s2};
		for(Human item:people) {
			System.out.println(item.showInfo());//오버라이딩된 메서드를 우선적용한다.
		}
	}
}
