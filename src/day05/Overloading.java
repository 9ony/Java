package day05;

class Superman {
	String name;
	int height;
	int power;

	// 생성자 오버로딩
	public Superman() {// 디폴트생성자 :파라미터아무것도안받는애들
		this("아무개슈퍼맨",160,100);
//		name = "아무개슈퍼맨";
//		height = 160;
//		power = 100;
		//this()는 생성자 안에서만 호출 가능하며
		//첫번째 줄에서 호출해야 한다
		//super()와는 함께 사용할 수 없다.
	}

	public Superman(String name) {
		this(name,165,200);
//		this.name = name;
//		height = 165;
//		power = 200;
	}

	public Superman(String name, int height) {
		this(name,height,150);
//		this.name = name;
//		this.height = height;
//		power = 150;
	}

	public Superman(String name, int height, int power) {
		this.name = name;
		this.height = height;
		this.power = power;
	}
//	private Superman(String n,double p) {
//		this.name=n;
//		this.height = 154;
//		this.power = p;
//	}
//	Superman(String n,double p) {
//		
//	}
//	protected Superman(String n,double p) {
//		
//	}
//	public Superman(String n,double p) {
//		
//	}
	public String showInfo() {
		String str = "---슈퍼맨 정보---\n";
		str += "이름: " + name + "\n키 : " + height + "\n초능력: " + power;
		return str;
	}
}///////////////////////

class Aquaman {
	String name;
	int height;
	double speed;

	public Aquaman() {// 디폴트생성자 :파라미터아무것도안받는애들
//		name="아무개아쿠아맨";
//		height=160;
//		speed=100; this가 첫번째로 와야됨!!
		this("아무개아쿠아맨",180);
		speed=100.5;
	}

	public Aquaman(String name) {
//		this.name = name;
//		height = 180;
//		speed = 100.5;
		this(name,180);
		speed = 100.5;
	}

	public Aquaman(String name, int height) {
		this.name = name;
		this.height = height;
		speed = 50;
	}

	public String showInfo() {
		String str = "---아쿠아맨 정보---\n";
		str += "이름: " + name + "\n키 : " + height + "\n스피드: " + speed;
		return str;
	}
}///////////////////////

public class Overloading {
	public static void main(String[] args) {
		Superman s1 = new Superman();
//		sman.name = "슈퍼맨";// sman.setName("김슈퍼");
//		sman.height = 190;// sman.setHeight(177);
//		sman.power = 100;
		System.out.println(s1.showInfo());

		Superman s2 = new Superman("최슈퍼");
		System.out.println(s2.showInfo());

		Superman s3 = new Superman("장슈퍼", 159, 600);
		System.out.println(s3.showInfo());

		Aquaman a1 = new Aquaman();
		System.out.println(a1.showInfo());
		Aquaman a2 = new Aquaman("최아쿠아");
		System.out.println(a2.showInfo());
		Aquaman a3 = new Aquaman("최아쿠아", 190);
		System.out.println(a3.showInfo());
		System.out.println("***************************");
		
		//슈퍼맨을 저장할 배열을 생성하고 저장한 뒤 반복문 돌려 정보 출력하기
		Superman[] sman_list = {s1,s2,s3};
		for(Superman sman:sman_list) {
			System.out.println(sman.showInfo());
		}
		
		Object[] arr= {s1,s2,s3,a1,a2,a3};
		//instanceof 연산자
		/*
		 * instanceof 연산자
		 * 참조변수 instanceof 클래스명
		 * : 참조변수가 클래스의 객체이면 true, 아니면 false를 반환
		 */
		
		
		for(Object obj:arr) {
			if(obj instanceof Superman) {
			Superman st= (Superman)obj;
			System.out.println(st.showInfo());
			}else {
			Aquaman am=(Aquaman)obj;
			System.out.println(am.showInfo());
			}
		}
	}
}/////////////////////
