package day07;
import java.util.*;

import javax.swing.JOptionPane;
public class AnimalTest {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("동물을 입력하세요~!");
//		String animal = sc.next();
//		System.out.println("낳은 새끼나 알의 개수를 입력해주세요~!");
//		int baby = sc.nextInt();
		String animal=JOptionPane.showInputDialog("동물 종류 입력");
		String babys=JOptionPane.showInputDialog("새끼 수 입력");
		int baby=Integer.parseInt(babys);
		Animal an = null; //애니멀객체에 초기값할당
		if(animal.equals("강아지")) { //animal=="강아지"은 주소값이 달라서 false로 인식
			an = new Dog();
//			System.out.println(animal.toString()+" 우는소리");
//			Animal ad = new Dog();
//			ad.crySound();
//			ad.getBaby(baby);
		}else if(animal.equals("고양이")) {
			an = new Cat();
//			System.out.println(animal.toString()+" 우는소리");
//			Animal ad = new Cat();
//			ad.crySound();
//			ad.getBaby(baby);
		}else if(animal.equals("오리")) {
			an = new Duck();
//			System.out.println(animal.toString()+" 우는소리");
//			Animal ad = new Duck();
//			ad.crySound();
//			ad.getBaby(baby);
		}else {
			System.out.println(animal.toString()+"라는 동물은 없어요~!");
			return;//동물없을때 main종료
		}
		an.crySound();
		an.getBaby(baby);
	}

}
