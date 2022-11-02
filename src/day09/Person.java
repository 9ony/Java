package day09;
//도메인객체 (값을 가지고있는 객체) (VO - Value Object,DTO-Data Transfer Object 라고함)
public class Person {
	private String name;
	private int age;
	public Person() {//생성자
		this("아무개",1);
	}
	public Person(String n,int a) {
		name=n; age=a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
