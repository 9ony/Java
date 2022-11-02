package day05;

public class CoffeeShop {

	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();
		// 밀크커피 내오기
		vm.makeTea(2,1,1);
		// 설탕커피 내오기
		vm.makeTea(2,1);
		//블랙커피 내오기
		System.out.println(vm.makeTea(1));
		System.out.println(vm.makeTea(1,(short)1));
		
		vm.makeYuja2(1, 1);
		Yuja y = new Yuja();
		y.setYuja(2);
		y.setSugar(1);
		vm.makeYuja(y);
		
	}

}
