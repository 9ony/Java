package day12;
/*파일을 읽어서 콘솔에 출력해보자
 * 데이터 소스: 파일 => 노드스트림(FileInputStream)
 * 데이터 목적지: 콘솔=> 노드스트림(System.out)
 * 
 * */
import java.io.*;
public class FileInputStreamTest2 {

	public static void main(String[] args) 
	throws IOException
	{
		String fname="src/day11/Account.java";
		FileInputStream fis = new FileInputStream(fname);
		int n=0,count=0,total=0;
		//배열에 담아서 읽고 출력하세여
		byte data[]= new byte[1000];
		while((n=fis.read(data))!=-1) {
			System.out.println("n:"+n);
			System.out.write(data, 0 ,n);
			count++;
			total+=n;
		}
		System.out.println("반복문 횟수: "+count+"\t 총바이트수: "+total);
		fis.close();
		System.out.close();
	}

}
