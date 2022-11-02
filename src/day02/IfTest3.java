package day02;

//java 11버전 이후: java.base모듈만 사용 가능함 (java.lang , java.util, java.io, java.net)
import javax.swing.JOptionPane;

public class IfTest3 {

	public static void main(String[] args) {
		String kor = JOptionPane.showInputDialog("국어 점수를 입력하세요");
		String eng = JOptionPane.showInputDialog("영어 점수를 입력하세요");

		System.out.println("국어점수는: " + kor + "\n영어점수는: " + eng);
		System.out.println(Integer.parseInt(kor) +Integer.parseInt(eng));

		// java.lang.Integer클래스의 메서드
		// public static int parseInt(String s):문자열 s를 정수로 반환해준다.
		// static메서드(클래스 메서드): 클래스명.메서드명() 으로 접근해야함
		
		//평균구해서 학점주기 90> =A 80>B 70>C .........
		int total= Integer.parseInt(kor) +Integer.parseInt(eng);
		double avg=total/2.0;
		char hakjum=' ';
		if(avg>=90) {
				hakjum='A';
			}else if(avg>=80) {
				hakjum='B';
			}else if(avg>=70) {
				hakjum='C';
			}else if(avg>=60) {
				hakjum='D';
			}else{
				hakjum='F';
			}
			System.out.println("국어\t영어");
			System.out.println("-----------");
			System.out.println(kor+"\t"+eng);
			System.out.println("-----------");
			System.out.println("합계 :"+total+"점");
			System.out.println("평균 :"+avg+"점");
			System.out.println("합계 :"+hakjum);
			
	}
}
