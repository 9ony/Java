package day07;

public abstract class Shape {//도형
	int x, y;
	public String getInfo() {
		return "나 도형 클래스야";
	}
	abstract public void area(int a,int b);


}///////////////////////////////////

class Rectangle extends Shape
{
	public void area(int w , int h) {
		int a=w*h;
		System.out.println("사각형 면적: "+a);
	}
}///////////////////////////////

class Triangle extends Shape
{
	public void area(int a,int b) {
		int t=(a*b)/2;
		System.out.println("직삼각형 면적: "+t);
	}
}////////////////////////////////

//class Circle extends Shape
//{
//	double pi=3.14;
//	@Override
//	public void area(int r,int r2) {
//	}
//	//Overload
//	public void area(int r) {
//		System.out.println("원의 면적: "+(pi*r*r));
//	}
//}//////////////////////////////////

abstract class Circle extends Shape
{
	double pi=3.14;
}
class SubCircle extends Circle{
	@Override
	public void area(int r,int r2) {
	}
	//Overload
	public void area(int r) {
		System.out.println("원의 면적: "+(pi*r*r));
	}
}