package day12;
/*파일을 읽어서 콘솔에 출력해보자
 * 데이터 소스: 파일 => 노드스트림(FileInputStream)
 * 데이터 목적지: 콘솔=> 노드스트림(System.out)
 * 
 * */
import java.io.*;
public class FileInputStreamTest {

	public static void main(String[] args) 
	throws IOException
	{
		String fname="src/day12/InputStreamTest3.java";
		FileInputStream fis = new FileInputStream(fname);
		int n=0, count=0;
		while((n=fis.read())!=-1) {//file끝에 도달하면 -1를 반환함
//			System.out.print((char)n);
			System.out.write(n);
			count++;
		}
		System.out.println(count+"bytes 읽고 씀");
		fis.close();
		System.out.close();
	}

}
