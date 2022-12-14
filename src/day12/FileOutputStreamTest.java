package day12;
/*[실습]키보드로 입력받은 내용을 파일(C:/MyJava/Workspace/Begin/result.txt)에 저장하는 기능
 * -------------------------------------
 * 데이터 소스 : 키보드===>노드스트림(System.in)
 * 데이터목적지: 파일 ===>노드스트림(FileOutputStream)
 * */
import java.io.*;
public class FileOutputStreamTest {

	public static void main(String[] args) 
	throws Exception{
		String fname="C:/myjava/workspace/Begin/result.txt";
		FileOutputStream fos = new FileOutputStream(fname);
		byte[] data=new byte[100];
		int n=0,count=0,total=0;
		System.out.println("입력하세요=>");
		while((n=System.in.read(data))!=-1) {
			fos.write(data,0,n);
			fos.flush(); //스트림에 남아있는 데이터가 있으면 밀어내준다
			total+=n;
		}
		System.out.println(fname+"에"+total+"byte만큼 썻어요");
		fos.close();
	}

}
