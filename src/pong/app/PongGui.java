package pong.app;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PongGui extends JFrame {

	Container cp;
	MyHomePanel p2;
	MyLoginPanel p1;
	MyJoinPanel p3;
	CardLayout card;
	Member m;
	HashMap<String, Member> map = new HashMap<>();

	public PongGui() {
		cp = this.getContentPane();// default=> BorderLayout
		cp.setLayout(card = new CardLayout());// 카드레이아웃 설정
		p1 = new MyLoginPanel();
		p2 = new MyHomePanel();
		p3 = new MyJoinPanel();

		cp.add(p1, "login");
		cp.add(p2, "home");
		cp.add(p3, "join");

		p1.setBackground(Color.yellow);
		p2.setBackground(Color.pink);

		MyHandler handler = new MyHandler();
		p1.btnLogin.addActionListener(handler);
		p1.btnJoin.addActionListener(handler);
		p2.btnEdit.addActionListener(handler);
		p2.btnLogout.addActionListener(handler);
		p3.btnHome.addActionListener(handler);
		p3.btnSubmit.addActionListener(handler);
		this.setSize(400, 600);
		this.setLocation(1000, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// --------------------------------

	private boolean check(String name, String pw) {
		boolean flag = true;
		Set<String> set = map.keySet();
		for (String s : set) {
			if ((map.get(s).getName() + map.get(s).getPw()) == (name + pw)) {
				flag = false;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	private void save(Member m) {
		map.put(m.getName(), m);
	}

	private void edit(String name) {
		map.put(name, m);
	}

	private void login() throws NotSupportedNameException, Exception {
		String name = p1.tfName.getText();
		char[] pwd = p1.tfPwd.getPassword();
		String strPwd = new String(pwd);
		if (map.containsKey(name)) {
			if (map.get(name).getPw().equals(strPwd)) {
				if (name.startsWith("퐁")) {
					card.show(cp, "home");
				} else if (name.startsWith("콩")) {
					throw new NotSupportedNameException("콩씨는 절대로 이용 불가!!");
				} else {
					p2.name = name;
					p2.tel = map.get(name).getTel();
					cp.add(p2, "home");
					card.show(cp, "home");
					throw new Exception("기타 성씨는 이용에 제한이 있어요");
				}
			} else
				JOptionPane.showMessageDialog(p1, "비밀번호가 틀렸어요!", "비밀번호 오류", JOptionPane.PLAIN_MESSAGE);
		} else {
			throw new NotSupportedNameException("올바르지 않은 회원 정보입니다!");
		}
	}// ----------------------------------

	private void submit() {
		String name = p3.jtfName.getText();
		char[] pwd = p3.jtfPwd.getPassword();
		String strPwd = new String(pwd);
		String tel = p3.jtfTel.getText();
		if (check(name, strPwd) == true) {
			m = new Member(name, strPwd, tel);
			save(m);
		} else {
			System.out.println("사용할 수 없는 아이디입니다.");
		}
	}

	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			if (o == p1.btnLogin) {
				try {
					login();
				} catch (NotSupportedNameException ex) {
					JOptionPane.showMessageDialog(p1, ex.getMessage(), "경고", JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(p1, ex.getMessage(), "경고", JOptionPane.PLAIN_MESSAGE);
				}
			} // if----p1
			else if (o == p1.btnJoin) {
				card.show(cp, "join");
			} else if (o == p3.btnSubmit) {
				submit();
			} else if (o == p3.btnHome || o == p2.btnLogout) {
				card.show(cp, "login");
			}
//			else if (o==p2.btnEdit) {
//				edit(joinUser);
//			}

		}
	}///////////////////////

	public static void main(String[] args) {
		new PongGui();
	}

}
