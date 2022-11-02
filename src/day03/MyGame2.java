package day03;
import javax.swing.*;
public class MyGame2 {

	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog
				("알파벳,0~9사이의 숫자,그외 문자 중 하나를 입력하세요.");
		System.out.println(str);
		if(str==null) return;
		//String클래스의 메서드: charAt(int i): 문자열의 인덱스i 번째의 문자를 하나 추출
		// char charAt(int index) : 객체명.charAt(4)
		//
		//"Hello"
		
//		  String s="Hello";
//		  char ch=s.charAt(4);
//		  System.out.println("ch: "+ch);
//		 
		//입력받은 문자열의 첫 문자를 가지고 판단하되
		//숫자면 "숫자이군요!", 알파벳대소문자 => "알파벳입니다", 그 외 문자는 "기타 문자입니다"
		
		char ch=str.charAt(0);
		if(ch>='0'&&ch<='9') {
			System.out.println("숫자입니다");
		}else if(ch>='A'&&ch<='Z') {
			System.out.println("영어입니다");
		}else if(ch>='a'&&ch<='z') {
			System.out.println("영어입니다");
		}
		else System.out.println("그외다른문자군요");
		
		System.out.println("-----------------------------------");
		//[2] java.lang.Character클래스 활용
//		숫자여부 	static boolean isDigit(char)
//		알파벳여부	static boollean isAlphabetic(int)
//		소문자 static boolean isLowerCase(char)
//		대문자 static boolean isUpperCase(char)
		if(Character.isAlphabetic(ch)==true) {
			System.out.println("알파벳이에요");
			if(Character.isUpperCase(ch)){
				System.out.println("대문자네요");
			}else {
				System.out.println("소문자네요");
			}
		}else if(Character.isDigit(ch)==true) {
			System.out.println("숫자에요");
		}
		
	}

}
