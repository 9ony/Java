package day02;

public class DataType {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	//위에는 기본형
	String str;
	// String class interface array(배열) enum(열거) 는 참조형
	public static void main(String[] args) 
	{
		int k=5;//지역변수 (local variable, automatic변수)
		System.out.println(k);
		
		DataType obj=new DataType();//메인 외부에서참조 할때 객체선언해줘야함
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.c);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.bool);
		System.out.println(obj.str);
	}

}
