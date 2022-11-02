package day11;

public class ThreadTest {

	public static void main(String[] args) {
		//1. Runnable객체를 생성
		Snail r=new Snail();
		//2. Thread객체 생성
		Thread tr=new Thread(r);
		//3. start()호출
		tr.start();
	}

}
