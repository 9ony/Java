package day11;
//1만원씩 저축하는 스레드
import java.util.Random;

public class UserIn extends Thread{
	private Account account;
	public UserIn(String name, Account ac) {
		this.account=ac;
		setName(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			int val=1;
			account.save(val);
		}
	}
}
