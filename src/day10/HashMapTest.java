package day10;

import java.util.*;

public class HashMapTest {
	//회원의 아이디===비밀번호
	HashMap<String, String> map=new HashMap<>();
	
	public void join() {
		map.put("hong","123" );
		map.put("choi","abc" );
		map.put("admin","tiger" );
		System.out.println(">>> 회원가입 완료 <<<");
	}//--------------
	public void loginCheck() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("아이디: ");
			String userid=sc.next();
			System.out.print("비밀번호: ");
			String pwd=sc.next();
			/*입력한 값이 map에 저장되어 있는지 체크
			 * 1) 해당 아이디가 map에 저장되어 있는지 검사
			 *    (a) 없다면 => "없는 아이디입니다"
			 *    (b) 있다면 
			 *    		=> 비밀번호 체크
			 *    			=> 비번 일치하면 
			 *    				[1] 일반 유저=> 환영메시지 보여주기
			 *    				[2] 관리자면 => 관리자 모드를 이용할 수 있어요	
			 *             반복문 벗어나기
			 * */
			boolean b=map.containsKey(userid);
			if(!b) {
				System.out.println(userid+"는 없는 아이디입니다.");
				continue;
			}else {
//				boolean b2=map.containsValue(pwd);
				//[x] 해시맵에잇는 비밀번호를 다검색해서 일치하는게있으면 true로 반환하기 때문에 현재 원하는 키값과 비교가 안됨
				System.out.println(map.containsValue(pwd));
				String realPwd=map.get(userid);//현재입력한 유저아이디의 비번을 저장
				boolean b2=realPwd.equals(pwd);//저장된비밀번호와 입력한 비밀번호를 비교 후 t,f반환
				if(!b2) {
					System.out.println("비밀번호가 틀립니다.");
					continue;
				}
				if(userid.equals("admin")) {
					//어드민유저
					System.out.println("관리자모드를 이용할 수 있습니다.");
				}else {
				//일반유저
				System.out.println("환영합니다 "+userid+"/"+pwd);
				}
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		HashMapTest hm=new HashMapTest();
		hm.join();
		hm.loginCheck();
	}

}
