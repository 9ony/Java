package day04;

//import java.net.MulticastSocket;

public class JobKoreaApp {

	public static void main(String[] args) {
		Person p = new Person();
		String info=p.memberInfo();
		System.out.println(info);
		
		p.name="이상화";
		p.age=22;
		p.skill="Java 중급";
		p.profile="개발경력 3년";
		
		info=p.memberInfo();
		
		p.openProfile();
		
		p.changeState();//구직상태를 true로 바꿈
		p.openProfile();
		System.out.println("--------------------------------");
		//[1]
		//객체를 2개 더 생성하세요. 이름,나이,스킬,프로필 정보를 할당하고
		//공개여부 설정한 뒤 프로필을 출력하세요		
		Person p2 = new Person();
		p2.name="김철수";
		p2.age=28;
		p2.skill="React 중급";
		p2.profile="개방경력 2년";

		Person p3 = new Person();
		p3.name="홍길동";
		p3.age=26;
		p3.skill="Java 초급";
		p3.profile="신입";
		
		p2.openProfile();
		p3.openProfile();
		System.out.println("--------------------------------");
		//[2] 구직자 객체 3개를 저장할 배열을 선언하고 해당 배열에 저장하세요
		//   반복문 이용해서 모든 구직자 정보를 출력하세요
		
		Person[] list={p,p2,p3};
//		for(Person i:list) {
//			i.openProfile();
//		}
		for(int i=0;i<list.length;i++) {
			if(!list[i].state)
				list[i].changeState();
			list[i].openProfile();
		}
		System.out.println("--------------------------------");
		
		Company c1= new Company();
		c1.input("네이버", "1999.6.2", 4000, "IT","디자이너/서비스 기획자");
		Company c2= new Company();
		c2.input("SKTelecom", "1984.3.29", 40000, "통신","네트워크SW개발직/서버관리직/보안직");
		Company c3= new Company();
		c3.input("현대자동차", "1967.12.29", 100000, "자동차","R&D직무");
//		System.out.println(c1.companyInfo());
		
		Company[] c_list = {c1,c2,c3};
		for(Company c:c_list) {
			if(!c.state) c.changeState();
			c.openProfile();
		}
		
		
		
	}

}
