package day05;

public class CoffeeMachine {
	//접근제한자
	//public : 어디서든 접근 가능
	//private: access modifier (접근지정자) 자기클래스 내에서만 접근가능
	
	private int coffee;
	private int sugar;
	private short cream;
	
	//setter----
	public void setCoffee(int c) {
		coffee=c;
	}
	//getter----
	public int getCoffee() {
		return coffee;
	}
	public void setSugar(int c) {
		sugar=c;
	}
	//getter----
	public int getSugar() {
		return sugar;
	}
	public void setCream(short s) {
		cream=s;
	}
	//getter---- 
	public short getCream() {
		return cream;
	}
}
