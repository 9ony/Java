package day05;

import java.lang.*;
import java.util.Arrays;

public class SchoolApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setNo(1);
		s.setName("홍길동");
		s.setClassName("자바반");
		
		s.printInfo();
		
		Teacher t = new Teacher();
		t.setNo(100);
		t.setName("김교사");
		t.setSubject("C언어");
		
		t.printInfo();
		System.out.println("-------------------------------");
		//문제1]학생 객체를 2개 더 생성하고...
		//        각각 이름,학번,전공 값을 넣어준뒤...
		//			배열에 저장하자.
		//			for루프 돌리면서 저장된 학생 객체들의
		//         정보를 출력해보자.

		Student s1 =new Student();
		s1.setNo(2);
		s1.setName("김철수");
		s1.setClassName("파이썬반");
		Student s2 =new Student();
		s2.setNo(3);
		s2.setName("이창수");
		s2.setClassName("빅데이터반");
		
		Student[] stList = {s,s1,s2};
		Student[] arr1= stList;
		System.out.println(arr1.length);
		arr1[1]=null;
		System.out.println(Arrays.toString(arr1));
		arr1[1]=arr1[1+1];
		arr1[1+1]=null;
		System.out.println(Arrays.toString(arr1));
		for(Student stu:arr1) {
			stu.printInfo();
		}
		
		for(Student st:stList) {
			st.printInfo();
		}
	}

}
