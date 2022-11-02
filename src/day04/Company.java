package day04;
//속성 3~4, 기능: 2개 이상
//JobkoreaApp에서 객체 생성해서 메서드 호출하기
//배열에 회사객체 저장후 반복문 돌려 출력하기
public class Company {
	String name; //회사이름
	String year; //설립년도
	int persons; //사원수
	String indistry; //산업명
	boolean state;
	String position; //구인포지션

	public void input(String c_name,String c_year,int c_persons,String c_indistry,String c_position){
		name=c_name;
		year=c_year;
		persons=c_persons;
		indistry=c_indistry;
		position=c_position;
		}
	public String companyInfo() {
		String str = name+" 회사정보----\n";
		str+= "설립년도 : "+year+"\n";
		str+= "사원수 : "+persons+"\n";
		str+= "산업명 : "+indistry+"\n";
		str+= position+"를(을) 원합니다.\n";
		
		return str;
	}
	public void changeState() {
		state = !state;
	}
	public void openProfile() {
		if(state) {
			System.out.println(companyInfo());
		}else
			System.out.println(name+"회사는 구직중이 아닙니다.");
	}
}