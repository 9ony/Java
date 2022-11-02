package day03;

import javax.swing.*;

public class LoopTest {

	public static void main(String[] args) {
		String dan = JOptionPane.showInputDialog("구구단 몇단을 할까요?");
		// [1]입력받은 구구단 출력
		int i = 1;
		int result = 0;
		while (i <= 9) {
			result = Integer.parseInt(dan) * i;
			System.out.println(dan + "*" + i + "=" + result + "\n");
			i++;
		}
		i = 1;
		while (i <= 9) {
			result = 0;
			int j = 2;
			System.out.print("\n");
			while (j <= Integer.parseInt(dan)) {
				result = j * i;
				System.out.print(j + "*" + i + "=" + result+"\t");
				j++;
			}
			i++;
		}
	}

}
