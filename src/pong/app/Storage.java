package pong.app;
import java.util.*;
public class Storage {
	public HashMap<String,Member> map = new HashMap<>();
	private String str= "";
	public void save(Member m) {
		map.put( m.getName() , m);
	}
//	public String delete(String tel) {
//		if(map.containsKey(tel)){
//			map.remove(tel);
//			return "정상적으로 삭제되었습니다.";
//		}else {
//			return "입력하신 정보와 일치하는 회원이 없습니다.";
//		}
//	}
	public String print(String name) {
		String str = "";
		Set<String> key = map.keySet();
		if (name == "All") {
			for (String k : key) {
				str += "이름 : " + map.get(k).getName() + "\n"
						+ "전화번호 : "+ map.get(k).getTel() + "\n"
						+ "비밀번호: "+ map.get(k).getPw() + "\n";
			}
		} else if(map.containsKey(name))
		{
			str = "이름 : " + map.get(name).getName() + "\n"
					+ "전화번호 : "+ map.get(name).getTel() + "\n"
					+ "비밀번호: "+ map.get(name).getPw() + "\n";
		}else {
			str = "일치하는 회원이 없습니다.";
		}
		return str;
	}

	public String size() {
		return "현재까지 "+String.valueOf(map.size())+"가입했어요!";
	}
}
