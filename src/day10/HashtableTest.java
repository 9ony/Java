package day10;
/*Map계열
 * Hashtable
 * - Object유형을 저장할 수 있다
 * - key와 value값을 매핑하여 저장한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터가 75%차면 자동으로 저장 역역을 확대한다.
 * - 데이터 저장: Object put(Object key, Object value)
 * - 데이터 꺼내기: Object get(Object key)
 * */
import java.util.*;
import java.awt.*;
public class HashtableTest {

	public static void main(String[] args){
		Hashtable h = new Hashtable(20, .8f);//초기용량:20, 적재율 0.8
		h.put("하나", 1);
		h.put("하나", "Two");
		h.put("하나", "Blue");
		h.put("하나", java.awt.Color.RED);
		
		Object obj=h.get("하나");
//		Integer il=(Integer)obj;
//		System.out.println(il);
		
		Color cr=(Color)h.get("빨강");
		System.out.println(cr);
		System.out.println("----------------");
		Hashtable<String,Integer> h2=new Hashtable<>();
		h2.put("생년",2000);
		h2.put("나이",22);
		h2.put("용돈", Integer.valueOf(50000));
		h2.put("나이", 33);
		//key값의 중복을 허용하지 않음
		//나중에 저장한 값으로 덮어쓰기함
		
		Integer age=h2.get("나이");
		System.out.println(age);
		System.out.println("h2.size(): "+h2.size());
		System.out.println("----------------");
		//키값들만 추출하는 메서드를 이용해서 key값들만 출력하세요
		//keys()
		System.out.println(h2.keys());
		Enumeration<String> en=h2.keys();
		while(en.hasMoreElements()) {
			String key=en.nextElement();
			System.out.println(key+": "+h2.get(key));
		}
		System.out.println("----------------");
		Enumeration<String> en2=h2.keys();
		for(;en2.hasMoreElements();) {
			System.out.println(en2.nextElement());
		}
		//Value값들만 추출하는 메서드를 이용해서 value값들만 출력하세요
		Enumeration<Integer> en3=h2.elements();
		for(;en3.hasMoreElements();) {
			System.out.println(en3.nextElement());
		}
		
		System.out.println("----------------");
		
		//Set<k> keySet()
		Set<String> set=h2.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("----------------");
		for(String str:set) {
			System.out.print(str+" /");
			System.out.println(h2.get(str));
			
		}
	}

}
