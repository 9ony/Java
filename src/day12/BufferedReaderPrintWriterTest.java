package day12;

//파일을 읽되 라인단위로 읽어서 앞에 줄번호를 붙여 콘솔에 출력하자 
//데이터소스:파일(FileInputStream)==>InputStreamReader==>BufferedReader
//	      파일(FileReader)===>BufferedReader
//데이터목적지: 콘솔(System.out)==>PrintWriter
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class BufferedReaderPrintWriterTest {
	public static void main(String[] args) throws Exception {
		String fname = "src/day12/BufferedReaderWriterTest.java";
		BufferedReader br = new BufferedReader(new FileReader(fname));
		PrintWriter pw = new PrintWriter(System.out, true);
		// true를 주면 new line을 만났을때 자동으로 flush해준다 (autoflush 기능)
		String line = "";
		int cnt = 0;
		while ((line = br.readLine()) != null) {
			/*
			 * pw.write(++cnt+": "+line); pw.flush();
			 */
			pw.println(++cnt + ": " + line);
		}
		pw.close();
		br.close();
	}
}
