package day12;

/*
 * ObjectOutputStream
 * :자바의 다양한 자료형과 객체를 저장할 수 있는 스트림
 * -1byte기반 스트림
 * -필터 스트림
 */
import java.io.*;
import javax.swing.*;
import java.util.Date;

public class ObjectInOut2 {

	public static void main(String[] args) throws Exception {
		String fname = "src//day12/obj2.txt";
		// 파일=>FileInputStream=>ObjectInputStream
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));

		Object obj1 = ois.readObject(); // JFrame
		Object obj2 = ois.readObject(); // Date
		// 쓴 순서대로 읽어들임 FIFO
		JFrame f = (JFrame) obj1;
		f.setSize(200, 200);
		f.setVisible(true);

		Date d = (Date) obj2;
		System.out.println(d);

		/*
		 * m1,m2,m3를 읽어서 복원시킨뒤 showInfo()호출해서 반환값 출력하기
		 */
		Member m1 = (Member) ois.readObject();
		Member m2 = (Member) ois.readObject();
		Member m3 = (Member) ois.readObject();

		System.out.println(m1.showInfo());
		System.out.println(m2.showInfo());
		System.out.println(m3.showInfo());

		ois.close();
	}

}
