package day12;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class RemoteIO {

	public static void main(String[] args) throws Exception {
		String str = "https://www.naver.com/";
		URL url = new URL(str);
		URLConnection con = url.openConnection();
		System.out.println(con);
		// 해당 url로 접속함
		InputStream is = con.getInputStream();
		// BufferedReader로 필터링해서
		// PrintWirter로 콘솔에 출력해보기
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(System.out, true);
		String line = "";
		int cnt = 0;
		while ((line = br.readLine()) != null) {
			pw.println(++cnt + ": " + line);
		}
		pw.close();
		br.close();
	}

}
