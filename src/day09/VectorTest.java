package day09;
import java.util.*;

//Java Collection : Vector, Hashtable, ArrayList, HashMap, HashSet..
/*자바 컬렉션 프레임웤
* - 프레임웤(사용방법을 미리 정해놓은 라이브러리를 의미)
* - 자바 컬렉션: 객체를 수집해서 저장하는 역할
*List : -입력순서 기억, 중복 데이터 저장 가능 -index
*Map: - key==value	, 순서x, key값은 중복저장 불가
*Set : - 입력순서 기억x, 중복 데이터 저장 불가
*
* 배열
* - 고정 크기
* - 동일한 데이터만 저장가능
* 
* Vector
* - 동적으로 저장 크기를 늘릴 수 있다.
* - 다른 종류의 데이터도 저장 가능 (다만, 기본자료형은 객체로 변환되어 저장됨(object 유형),즉 Object 유형의 객체들만 저장된다.
* 
* - List계열 컬렉션
* - 입력 순서를 기억한다.
* - 데이터 중복을 허용한다.
* 유사 클래스 : ArrayList (과제. 벡터와 ArrayList차이점 알아오기)
* 
* */

public class VectorTest {

	public static void main(String[] args) {
		System.out.println("-----------jdk1.4버전-------------");
		//jdk1.4 버전일 때
		Vector v=new Vector(5,3);
		//초기크기 5 , 초과될경우 3씩늘림
		v.add("Hello");
		v.add(Integer.valueOf(10));
		System.out.println("벡터v의 현재크기: "+v.size());
		System.out.println("벡터v의 현재용량: "+v.capacity());
		
		for(int i=1;i<5;i++) {
			v.add(i); //int를 넣어도 integer객체로 변환됨
		}
		System.out.println("벡터v의 현재크기: "+v.size());
		System.out.println("벡터v의 현재용량: "+v.capacity());
		//E get(int index), E elementAt(int index)
		
		Object obj=v.get(0);
		System.out.println(obj);
		System.out.println(((String)obj).toLowerCase());
		
		Integer a=(Integer)v.get(1);
		System.out.println(a);
		//jdk1.4는 형변환해야되서 귀찮음 5.0에서 개선함
		System.out.println("-----------5.0버전이후-------------");
		//jdk5.0버전일때 *1.4다음에 5.0으로 버전업(변화가많이일어나서)
//		Vector<String> v2= new Vector<String>();
		//또 7.0은 뒤에 new Vector<>가 된다
		Vector<String> v2= new Vector<>();
		v2.add("Orange");
		v2.add("Melon");
		v2.add("Apple");
//		v2.add(3.14); //스트링아니라 에러
		v2.add(String.valueOf(3.14));
		
		String str=v2.get(0);
		System.out.println(str.toLowerCase());
		System.out.println("-----------확장for루프-------------");
		//for루프 이용해서 v2에 저장된값 출력하기
		for(int i=0;i<v2.size();i++) {
//			String str1=v2.get(i);
			String str1=v2.elementAt(i);
			System.out.println(str1);
		}
		System.out.println("-----------확장for루프-------------");
		for(String s:v2) {
			System.out.println(s.toUpperCase());
		}
		System.out.println("-----------문제1-------------");
		//[문제1] Float유형을 저장할 벡터 v3를 생성하고
		// Float객체 3개 저장하세요.
		// 확장 for루프를 이용해 v3에 저장된 값들의 합계를 구하세요
		Vector<Float> vf= new Vector<>();
		int size=3;
		float sum=0f;
		for(int i=0;i<size;i++) {
			vf.add((float)Math.random()*10+1);
			System.out.println(vf.get(i));
			sum+=vf.get(i);
		}
		System.out.println(sum);
		System.out.println(vf.size());
	}

}