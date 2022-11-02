package day04;
//객체 = 속성(variable)+행동양식(method)
public class House {
	//1.속성-멤버변수(has a 관게까 성립해야함)
	int room;
	String ownerName;
	String addr;
	
	//2. 기능- 메서드
	public void printinfo() {
		System.out.println("-------House 정보------");
		System.out.println("소유주: "+ownerName);
		System.out.println("방수 : "+room);
		System.out.println("주소 :"+addr);
	}
	//집의 거래유형(전세,월세,매매), 가격
	public String rent(String type,int price) {
		String str="---"+ownerName+"의 집----\n";
			   str+="매매 유형 :"+type+"\n";
			   str+="거래 금액 :"+price+"\n";
		return str;
	}

}
