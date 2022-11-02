package day10;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		// Person객체 3개 생성
		//HashSet 저장
		//반복문 이용해서 사람정보 출력
		HashSet<Person> set=new HashSet<>();
		Person p1 = new Person("kim",25);
		Person p2 = new Person("Lee",22);
		Person p3 = new Person("Choi",24);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for(Person s:set) {
			System.out.println("이름: "+s.getName() +"/"+ "나이: "+s.getAge());
		}
		System.out.println("********************");
		Person p4 = new Person("Lee",22);
		//주소값이 다르므로 다른 값으로 인식
		//하지만 person에 hashCode메소드와 equals메소드를 통해 같은값이면 주소값을 동일하게 가져감
		Person p5 = p1;
		set.add(p4);
		set.add(p5);
		System.out.println(set.size());
	}

}
