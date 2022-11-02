package day09;
import java.net.MulticastSocket;
import java.util.*;
/*
/*ArrayList
 *  - java.util.List계열
 *  - Vector와 기능은 동일
 *  - Vector는 메서드들이 동기화가 구현되어 있는 반면,
 *    ArrayList는 동기화되어 있지 않음 => 가볍다 =>웹에서 주로 사용
 * 
 * */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		System.out.println(arrList.size()+"개 저장");
		
		Iterator<String> ir= arrList.iterator();
		for(int i=1;ir.hasNext();i++) {
		String p=ir.next();
		System.out.println(i+": "+p);	
		}
		
	//	Object[] toArray();
		Object[] arr=arrList.toArray();
//		System.out.println(arr[0]);
		for(Object obj:arr)
			System.out.println(obj);
		
		String str = arrList.get(2);
		System.out.println(str);
		
//		ir= arrList.iterator();
		Collections.sort(arrList);
		System.out.println("-----------sort이후-------------");
		ir= arrList.iterator();
		for(int i=1;ir.hasNext();i++) {
			String p=ir.next();
			System.out.println(i+": "+p);	
		}
		
		List<Person> list=Arrays.asList(
				new Person("김철수",22), new Person("최연희",21), new Person("홍길동",23));
		
		
		System.out.println("list.size(): "+list.size());
		for(Person p:list) {
			System.out.println(p.getName()+"  "+p.getAge());
		}
		
		
		
	}

}
