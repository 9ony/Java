package day07;

public class ShapeTest {
	public static void main(String[] args) {
		System.out.println("각 도형의 면적을 구합니다~~");
		System.out.printf("가로 %d, 세로: %d인 도형면적------\n",8,10);
		
		//사각형 객체 생성후 area()호출하기
//		Shape s = new Shape();
		Rectangle rt = new Rectangle();
		rt.area(8, 10);		
		//삼각형
		Triangle tr=new Triangle();
		tr.area(8, 10);
		
		//원:반지름8
		//Circle cc=new Circle();[x]
		//추상클래스는 타입선언은 할 수 있으나 인스턴스화 할 수는 없다.
		Circle cc=new SubCircle();
		((SubCircle)cc).area(8);
		
		SubCircle sc=new SubCircle();
		sc.area(8);
		
		Shape sr = new Rectangle();
		sr.area(5, 6);
		
		//rt,tr,cc,sc,sr 을 배열에 담고 넓이출력 넓이는 (12,15) 원은 반지름 12
		Shape[] arr = {rt, tr, cc, sc, sr};
		for(Shape i:arr) {
			if(i instanceof SubCircle) {
				((SubCircle) i).area(12);
			}else {				
				i.area(12, 25);
			}
		}

	}
}
