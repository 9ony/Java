package exSchoolApp;

import java.util.*;

public class SchoolApp2ex {
	private Scanner sc = new Scanner(System.in);
	private Member[][] memArr = new Member[3][5];// 학생,교사,직원담을 2차원배열
	private int countArr[] = { 0, 0, 0 };// 등록한 학생수를 담을 변수,교사수
	// 2, 5, 7, 8
	// 학생 검색 : 학번으로 검색하기
	// "학번 입력하세요": 1
	// 1번의 학생의 정보만 출력
	// 없으면 =>"등록되지 않는 번호입니다"
	// 학생 삭제: 학번으로 검색해서 있으면 배열에서 삭제 처리
	// 없으면 =>"등록되지 않은 번호입니다"
	// C (Create), R(Read), U(Update), D(Delete)

	public void menu() {
		System.out.println("****학사관리 프로그램 v1.1*****");
		System.out.println("** 1. 학생 등록			***");
		System.out.println("** 2. 교사 등록			***");
		System.out.println("** 3. 직원 등록			***");
		System.out.println("** 4. 학생 출력			***");
		System.out.println("** 5. 교사 출력			***");
		System.out.println("** 6. 직원 출력			***");
		System.out.println("** 7. 	검색				***");
		System.out.println("** 8. 	삭제				***");
		System.out.println("** 9. 종료				***");
		System.out.println("***************************");
		System.out.println("메뉴번호를 입력하세요 =>");
		System.out.println("***************************");
	}

	/** 학교 구성원 객체를 배열에 저장하는 메서드 */
	public void addMember(Member m, int menuNumber) {
		if (countArr[menuNumber] == 5) {
			System.out.println("현재 최대인원이에요!!");
			return;
		}
		m.inputInfo(menuNumber);
		m.printInfo(menuNumber);
		// -----번호 중복검사--------
		for (int i = 0; i < countArr[menuNumber]; i++) {
			if (m.getNo() == memArr[menuNumber][i].getNo()) {
				System.out.println("같은 번호가 존재합니다.");
				System.out.println("재입력 할까요? [1. 예 2. 아니오]");
				int no = sc.nextInt();
				if (no == 1) {
					addMember(m, menuNumber);
					return;
				} else
					return;
			}
		} // for end
		System.out.println("위 정보를 저장할까요? [1. 예 2. 아니오]");
		int no = sc.nextInt();
		if (no == 1) {
			memArr[menuNumber][countArr[menuNumber]++] = m;
			System.out.println(countArr[menuNumber] + "명 등록완료!!");
			return;
		} else {
			System.out.println("취소하였습니다. 현재등록인원 :" + countArr[menuNumber] + "명");
		}
	}

//출력 메서드
	public void printMember(int menuNumber) {
		if (countArr[menuNumber] == 0) {
			System.out.println("출력할 데이터가 없습니다.");
			return;
		}
		for (int i = 0; i < countArr[menuNumber]; i++) {
			// i범위를 countArr[menuNumber] 준이유는 memArr[menuNumber][i].length를 주면 안에 배열요소가 가득차
			// 있지 않으면 null에러가 뜸
			memArr[menuNumber][i].printInfo(menuNumber);
		}
	}

//검색 메서드
	public void searchMember() {
		System.out.println("1. 학생 검색");
		System.out.println("2. 교사 검색");
		System.out.println("3. 직원 검색");
		System.out.println("9. 취소");
		System.out.println("메뉴번호를 입력하세요 =>");
		int menuNumber = sc.nextInt();
		if (menuNumber == 9) {
			System.out.println("취소!!");
			return;
		} else if (menuNumber < 1 | menuNumber > 3) {
			System.out.println("올바르지 않은 메뉴번호 입니다. 다시 입력해주세요.");
			searchMember();
		} else {
			menuNumber--;
			if (countArr[menuNumber] == 0) {
				System.out.println("검색할 데이터가 없습니다.");
				return;
			}
			System.out.println("검색할" + memArr[menuNumber][0].getGroup() + "의 번호를 입력하세요 =>");
			int value = sc.nextInt();
			for (int i = 0; i < countArr[menuNumber]; i++) {
				if (value == memArr[menuNumber][i].getNo()) {
					memArr[menuNumber][i].printInfo(menuNumber);
					break;
				} else if ((i + 1) == countArr[menuNumber]) {
					System.out.println(value + "와 일치하는" + memArr[menuNumber][0].getGroup() + "의 번호가 없어요!");
				}
			}
		}
	}

//삭제 메서드
	public void deleteMember() {
		System.out.println("1. 학생 삭제");
		System.out.println("2. 교사 삭제");
		System.out.println("3. 직원 삭제");
		System.out.println("9. 취소");
		System.out.println("메뉴번호를 입력하세요 =>");
		int menuNumber = sc.nextInt();
		if (menuNumber == 9) {
			System.out.println("취소!!");
			return;
		} else if (menuNumber < 1 | menuNumber > 3) {
			System.out.println("올바르지 않은 메뉴번호 입니다. 다시 입력해주세요.");
			deleteMember();
		} else {
			menuNumber--; // index를맞추기위해 -1해줌
			if (countArr[menuNumber] == 0) {
				System.out.println("삭제할 데이터가 없습니다.");
				return;
			}
			System.out.println("삭제할 " + memArr[menuNumber][0].getGroup() + "의 번호를 입력하세요 =>");
			int value = sc.nextInt();
			int start = 0;
			for (int i = 0; i < countArr[menuNumber]; i++) {
				if (value == memArr[menuNumber][i].getNo()) { // 삭제할 값과 일치한 값이있을때
					memArr[menuNumber][i].printInfo(menuNumber);
					System.out.println("위 정보를 삭제할까요? [1. 예 2. 아니오]");
					int no = sc.nextInt();
					if (no == 1) {
						start = i; // start기준으로 뒷에 할당된 값을 당겨서 채우기위해 반복문시작점 할당;
						for (int j = start; j < countArr[menuNumber] - 1; j++) { // 배열인덱스값 start 기준으로 뒤에값들을 앞으로당김
							memArr[menuNumber][j] = memArr[menuNumber][j + 1];
							memArr[menuNumber][j + 1] = null;
						} // for end
						System.out.println("삭제완료. 현재등록인원 :" + (--countArr[menuNumber]) + "명");
						break; // for문 탈출
					} else {
						System.out.println("취소하였습니다. 현재등록인원 :" + countArr[menuNumber] + "명");
						deleteMember();
					} // if end
				} else if ((i + 1) == countArr[menuNumber]) { // 일치하는 값이 없음
					System.out.println(value + "와 일치하는" + memArr[menuNumber][0].getGroup() + "의 번호가 없어요!");
					deleteMember();
				}
			} // for end
		} // if
	}// deleteMember()
//----------------------------------Main------------------------//

	public static void main(String[] args) {
		SchoolApp2ex sa = new SchoolApp2ex();
		while (true) {
			sa.menu();
			int num = sa.sc.nextInt();
			Member m = new Member();
			if (num == 9) {
				System.out.println("잘가세요");
				System.exit(0);
			} else if (num > 0 & num < 4) {
				sa.addMember(m, num - 1);
			} else if (num > 3 & num < 7) {
				sa.printMember(num - 4);
			} else if (num == 7) {
				sa.searchMember();
			} else if (num == 8) {
				sa.deleteMember();
			} else {
				System.out.println("입력오류!! 메뉴에 없는 번호에요!!");
			}

		} // while
	}// main
}// class