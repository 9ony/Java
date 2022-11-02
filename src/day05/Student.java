package day05;
import java.util.*;
public class Student {
	private int no;
	private String name;
	private String className;
	
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
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return className;
	}
	/** 학생정보를 출력해 보여주는 메서드*/
	public void printInfo() {
		System.out.println("-------학생 정보--------");
		System.out.println("학 번 :"+no);
		System.out.println("이 름 :"+name);
		System.out.println("반이름 :"+className);
	}
	/** 학생정보를 입력받아 멤버변수에 저장하는 메서드*/
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("학번 입력: ");
		//this.no=sc.nextInt();//1번째방법
		setNo(sc.nextInt());//2번째방법
		System.out.print("이름 입력: ");
		setName(sc.next());
		System.out.print("학급 입력: ");
		setClassName(sc.next());
	}
	/** */
}
	
