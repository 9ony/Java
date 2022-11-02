package day10;

class SnailThread extends Thread
{
	public SnailThread(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.getName()+"스레드가 기어갑니다.");
			try {
				Thread.sleep(1000);
				//1초간 잠을잔다.
				//1/1000초단위
				//==> block상태가 된다 (sleep()/IO작업시)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest2 {

	public static void main(String[] args) {
		SnailThread tr1=new SnailThread("똘똘이 달팽이");
		SnailThread tr2=new SnailThread("홀쭉이 달팽이");
		SnailThread tr3=new SnailThread("이쁜이 달팽이");
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		System.out.println("Hello World~~~");
	}
}
