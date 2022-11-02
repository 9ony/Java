package day10;
import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list1=new LinkedList<>();
		Queue<String> list2=new LinkedList<>();
		
		list1.add("Hi");
		list1.add("Allo");
		list1.add("Bye");
		
		list2.offer("JSP");
		list2.offer("Servelt");
		list2.offer("Spring");
		
		System.out.println(list1.get(0));
		System.out.println("---------------------");
		Iterator<String> it=list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		Iterator<String> it2=list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("---------------------");
		list1.add(1,"Hello"); //add("인덱스","값") 으로 중간 인덱스값에 넣어주기 쉽다
		it=list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		LinkedList<String> lst=(LinkedList<String>)list2;
		lst.addFirst("Java");//맨앞에요소를 추가
		lst.addLast("Weka");//맨마지막에 요소추가
		
		it2=list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		String str=lst.poll();
		System.out.println(str.toLowerCase());
		
		lst.remove(2);
		System.out.println("---------------------");
		it2=list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//lst.removeFirst(), lst.removeLast()
		//pollFirst()      , pollLast()
		//첫번째 삭제           마지막삭제
		
		List<String> arr=Arrays.asList("a","b");
		list1.addAll(arr);//배열요소 전부다 추가
		it=list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
