package day05;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.setCoffee(1);
		cm.setSugar(2);
		cm.setCream((short)3);
		
		System.out.printf("커피: %d\n", cm.getCoffee());
		System.out.printf("설탕: %d\n", cm.getSugar());
		System.out.printf("크림: %d\n", cm.getCream());
	}

}
