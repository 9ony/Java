package exSchoolApp;

import java.util.*;
public class Member {
	private String group;
	private int no;
	private String name;
	private String className;
	private String subject;
	private String dept;

	//---학생,교사,직원 그룹을 나누기위해
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	//학번,교번,사번
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	//구성원 이름
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	//학급이름
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return className;
	}
	//담당과목
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	//담당부서
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/** 멤버정보를 출력해 보여주는 메서드 */
	public void printInfo(int menuNumber) {
		if (menuNumber == 0) {
			System.out.println("-------학생 정보--------");
			System.out.println("학 번 :" + no);
			System.out.println("이 름 :" + name);
			System.out.println("반이름 :" + className);
		} else if (menuNumber == 1) {
			System.out.println("-------교사 정보--------");
			System.out.println("교 번 :" + no);
			System.out.println("이 름 :" + name);
			System.out.println("과 목:" + subject);
		} else if (menuNumber == 2) {
			System.out.println("-------작원 정보--------");
			System.out.println("사 번 :" + no);
			System.out.println("이 름 :" + name);
			System.out.println("부 서 :" + dept);
		}
	}

	/** 멤버정보를 입력받아 멤버변수에 저장하는 메서드 */
	public void inputInfo(int menuNumber) {
		Scanner sc = new Scanner(System.in);
		if (menuNumber == 0) {
			setGroup("학생");
			System.out.print("학번 입력: ");
			// this.no=sc.nextInt();//1번째방법
			setNo(sc.nextInt());// 2번째방법
			System.out.print("이름 입력: ");
			setName(sc.next());
			System.out.print("학급 입력: ");
			setClassName(sc.next());
		}
		if (menuNumber == 1) {
			setGroup("교사");
			System.out.print("교번 입력: ");
			// this.no=sc.nextInt();//1번째방법
			setNo(sc.nextInt());// 2번째방법
			System.out.print("이름 입력: ");
			setName(sc.next());
			System.out.print("과목 입력: ");
			setSubject(sc.next());
		}
		if (menuNumber == 2) {
			setGroup("직원");
			System.out.print("사번 입력: ");
			// this.no=sc.nextInt();//1번째방법
			setNo(sc.nextInt());// 2번째방법
			System.out.print("이름 입력: ");
			setName(sc.next());
			System.out.print("부서 입력: ");
			setDept(sc.next());
		}
	}
	/** */
}