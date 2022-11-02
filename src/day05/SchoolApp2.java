package day05;

import java.util.*;

public class SchoolApp2 {
	private Scanner sc = new Scanner(System.in);
	private Student[] stuArr=new Student[5];//학생객체를 저장할 배열
	private Teacher[] teaArr=new Teacher[5];//교사객체를 저장할 배열
	private int count[] = {0,0};//등록한 학생수를 담을 변수,교사수
	//2, 5, 7, 8
	//학생 검색 : 학번으로 검색하기
	//"학번 입력하세요": 1
	//1번의 학생의 정보만 출력
	//없으면 =>"등록되지 않는 번호입니다"
	//학생 삭제: 학번으로 검색해서 있으면 배열에서 삭제 처리
	//		없으면 =>"등록되지 않은 번호입니다"
	//C (Create), R(Read), U(Update), D(Delete)
	public void menu() {
		System.out.println("****학사관리 프로그램 v1.1*****");
		System.out.println("** 1. 학생 등록			***");
		System.out.println("** 2. 교사 등록			***");
		System.out.println("** 3. 직원 등록			***");
		System.out.println("** 4. 학생 출력			***");
		System.out.println("** 5. 교사 출력			***");
		System.out.println("** 6. 직원 출력			***");
		System.out.println("** 7. 학생 검색			***");
		System.out.println("** 8. 학생 삭제			***");
		System.out.println("** 9. 종료				***");
		System.out.println("***************************");
		System.out.println("메뉴번호를 입력하세요 =>");
		System.out.println("***************************");
	}
	/** 학생객체를 배열에 저장하는 메서드*/
	public void addStudent(Student st) {
		st.inputInfo();
		st.printInfo();
		System.out.println("위 정보를 저장할까요? [1. 예 2. 아니오]");
		int no=sc.nextInt();
		if(no==1) {
//			stuArr[count]=st;
//			count++;
			stuArr[count[0]++]=st;
			System.out.println(count[0]+"명 등록완료!!");
		}
	}
	public void printStudents() {
		for(int i=0; i<count[0];i++) { //count를 준이유는 1명만 넣엇을때 에러나서! stuArr.lenght의 크기는2인데 stuArr[1]에 null값이있어 에러가난다
			stuArr[i].printInfo();
		}
	}
	
	public void addTeacher(Teacher te) {
		te.inputInfo();
		te.printInfo();
		System.out.println("위 정보를 저장할까요? [1. 예 2. 아니오]");
		int no=sc.nextInt();
		if(no==1) {
			teaArr[count[1]++]=te;
			System.out.println(count[1]+"명 등록완료!!");
		}
	}
	public void printTeacher() {
		for(int i=0; i<count[1];i++) { //count를 준이유는 1명만 넣엇을때 에러나서! stuArr.lenght의 크기는2인데 stuArr[1]에 null값이있어 에러가난다
			teaArr[i].printInfo();
		}
	}
//----------------------------------Main------------------------//
	public static void main(String[] args) {
		SchoolApp2 sa = new SchoolApp2();
		while (true) {
			sa.menu();
			int num = sa.sc.nextInt();
			if(num==0) {
				System.out.println("잘가세요");
				System.exit(0);
			}
			
			switch (num) {
			case 1:
				if(sa.count[1]>=sa.stuArr.length) {
					System.out.println("등록 마감되었어요!! 등록인원: "+sa.count[1]);
					//return;
					continue;
				}
				Student s1=new Student();
				sa.addStudent(s1);
				break;
			case 2:
				if(sa.count[1]>=sa.teaArr.length) {
					System.out.println("등록 마감되었어요!! 등록인원: "+sa.count[1]);
					//return;
					continue;
				}
				Teacher t1=new Teacher();
				sa.addTeacher(t1);
				break;
			case 3:
				break;
			case 4://stuArr에 저장된 객체를 반복문 돌면서 그 정보 출력하기
				sa.printStudents();
				break;
			case 5:
				sa.printTeacher();
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			default:
				System.out.println("입력오류!! 메뉴에 없는 번호에요!!");
			}// switch
		}//while
	}// main
}// class
