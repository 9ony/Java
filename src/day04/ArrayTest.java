package day04;

public class ArrayTest {

	public static void main(String[] args) {
		//for루프 이용해서 x값을 출력하세요
		
		
		int [] a= {10,20};
		int b[]= {9,8,7,6};
		int tmp[];
		//[1] a와 b의 배열을 서로 바꿔서 참조하도록 해보기
		 tmp=a;
		 a=b;
		 b=tmp;
		 for(int i=0; i<tmp.length;i++) {
			 System.out.println("tmp["+i+"]="+tmp[i]+" ");
		 }System.out.println("----------------");
		 for(int i=0; i<a.length;i++) {
			 System.out.println("a["+i+"]="+a[i]+" ");
		 }System.out.println("----------------");
		 for(int i=0; i<b.length;i++) {
			 System.out.println("b["+i+"]="+b[i]+" ");
		 }System.out.println("----------------");
		 
		 //[2] 요소 4개는 갖는 double 타입의 배열을 선언하여 초기화하세요.
		 //    그런 다음 이 배열 요소들의 평균값을 구해 출력하기
		 double []arr =new double[4];
		 arr[0]=1.23;
		 arr[1]=4.56;
		 arr[2]=-.78;
		 arr[3]=3;
		 
		 double sum=0;
		 for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
		 }
		 System.out.println("합계= "+sum);
		 System.out.println("평균= "+sum/arr.length);
		 
		 System.out.println("----------------");
		 //[3] float타입의 배열 요소를 받아들이는
			//			배열을 선언하고 크기는 3만큼 잡는다.
			//			인덱스0에는 -16.1을 넣어주고,
			//			인덱스1에는 200.1
			//			인덱스 2에는 30E-7의 값을 넣어주자.
		 float arr2[];
		 arr2=new float[3];
		 arr2[0]=-16.1f;
		 arr2[1]=200.1f;
		 arr2[2]=30E-7f;
		 
		 for(int i=0;i<arr2.length;i++) {
			 System.out.println(arr2[i]);
		 }
		 System.out.println("----------------");
		 
		 //String 을 저장할 배열을 생성하고 해당 배열에 문자열 3개 저장하세요.
		 String[] arr3=new String[3];
		 arr3[0]="Good Morning~";
		 arr3[1]=new String("Hello");
		 
		 for(int i=0; i<arr3.length;i++) {
			 System.out.printf("arr3[%d]: %s\n",i ,arr3[i]);
			 if(arr3[i]!=null) {
				 System.out.println(arr3[i].toUpperCase());
			 }
		 }
		 
		 Object o1=new Object();
		 Object o2=new Object();
		 Object o3=o2;
		 System.out.println("o1: "+o1.toString()); //o1.toString()를 호출해서 반환되는 문자열을 출력한다.
		 System.out.println("o2: "+o2);
		 System.out.println("o3: "+o3);
		 
		 String s1=new String("Hi");
		 String s2=s1;
		 System.out.println("s1: "+s1.toString());
		 System.out.println("s2: "+s2);
		 
		 //o1,o2,o3를 저장할 배열을 선언하고 저장하세요
		 //for루프 이용해서 배열에 저장된 객체를 출력하세요
		 //Object유형의 배열은 모든 클래스형의 객체들을 저장할 수 있다.
		 Object[] arr4=new Object[6];
		 arr4[0]=o1;
		 arr4[1]=o2;
		 arr4[2]=o3;
		 arr4[3]=s1;
		 arr4[4]=new java.util.Date();
		 for(Object obj:arr4) {
			 System.out.println(obj);
		 }
	 
		//arr3=> String타입의 배열
		//arr3[0]=o1; [x]
		 
		 
	}

}
