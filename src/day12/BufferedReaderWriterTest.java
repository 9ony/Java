package day12;

//키보드입력=>System.in => InputStreamReader => BufferedReader   
//라인단위로 입력받아보자
//콘솔출력 => System.out=> OutputStreamWriter => BufferedWriter/PrintWriter
import java.io.*;

public class BufferedReaderWriterTest {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader는 생성자에 Reader계열의 객체를 받아들인다.
		// 따라서 1바이트기반 스트림과 연결해야 할 때는 브릿지 스트림이 필요하다.
		// InputStreamReader는 1Byte데이터를 2Byte로 조합하여 출력
		// ===> charset을 맞추는 기능도 있음
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = "";
		bw.write("입력하세여=?\n");
		bw.flush();
		while ((line = br.readLine()) != null) {
			bw.write(line + "\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
