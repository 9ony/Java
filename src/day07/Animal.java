package day07;
//추상클래스 :  Animal
//추상메서드
//[1] public void crySound()
//         [2] public void getBaby(int n)
//
//강아지클래스: Dog  : "멍멍~~"	n마리의 새끼를 낳았어요
//고양이클래스: Cat   : "야옹 야옹~"       n마리의 새끼를 낳았어요
//오리클래스: Duck   : "꽥꽥~~"             n개의 알을 낳았어요
//----------------------------------------------------------------
//AnimalTest클래스:main()메서드에서 테스트
public abstract class Animal {
	abstract public void crySound();
	abstract public void getBaby(int n);
}
class Dog extends Animal{
	public void crySound() {
		System.out.println("멍멍~");
	}
	public void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요");
	}
}
class Cat extends Animal{
	public void crySound() {
		System.out.println("야옹~");
	}
	public void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요");
	}
}
class Duck extends Animal{
	public void crySound() {
		System.out.println("꽥꽥~");
	}
	public void getBaby(int n) {
		System.out.println(n+"개의 알을 낳았어요");
	}
}
