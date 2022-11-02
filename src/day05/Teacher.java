package day05;

import java.util.Scanner;

public class Teacher {
	private int no;
	private String name;
	private String subject;
	
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void printInfo() {
		System.out.println("-------교사 정보--------");
		System.out.println("교 번 :"+no);
		System.out.println("이 름 :"+name);
		System.out.println("반이름 :"+subject);
	}
	
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("교번 입력: ");
		//this.no=sc.nextInt();//1번째방법
		setNo(sc.nextInt());//2번째방법
		System.out.print("이름 입력: ");
		setName(sc.next());
		System.out.print("과목 입력: ");
		setSubject(sc.next());
	}
}
