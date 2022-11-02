package pong.app;

public class Member {
	private String name;
	private String pw;
	private String tel;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	//-----------settter / getter===========//

	public Member(String name,String pw,String tel) {
		this.name=name;this.pw=pw;this.tel=tel;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member user=(Member)obj;
			boolean bool=(this.tel.equals(user.name));
			return bool;
		}else {
			return false;
		}
	}
	
}
