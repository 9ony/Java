package day11;

public class Account {
	private int money=10;
	private boolean flag=false;
	
	
	//synchronized를 붙이면 해당 객체의 lock을 쥐어야만 해당 블락을 수행가능하다
	public void save(int val) {
		synchronized(this) {
		if(flag) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		money+=val;
		System.out.println("입금 잔액 :"+val+"   입금후 잔액 : "+money);
		flag=true;
		notify();
		}
	}
	synchronized public void get(int val) {
		if(!flag) {
			try {
				wait();
				//wait이 호출이되면 스레드는 수행권을 포기하고 wait pool에 가서 대기한다.
				//이때 락을 반납하고 대기상태로 들어감!
			}catch(InterruptedException e) {
				
			}
		}
		
		if(money-val<0) {
			System.out.println("잔액부족!");
			flag=false;
			notify();
			return;
		}
		money-=val;
		System.out.println("출금 잔액 :"+val+"   출금후 잔액 : "+money);
		flag=false;
		notify();
	}
}
