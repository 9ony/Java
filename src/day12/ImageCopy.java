package day12;
import java.io.*;
/*
 * bg.jpg를 읽어서 copy.jpg로 내보내자
 * 데이터 소스 : bg.jpg(파일) ===> 1바이트 단위로 읽어야함 FileInputStream
 * 데이터 목적지 : copy.jpg (!확장자맞춰야함) ===> FileOutputStream
 * 바이트수 출력하기
 */
public class ImageCopy {
	public static void main(String []args) 
	throws Exception
	{
		String fname="images/bg2.jpg";
		String target="C:/myjava/workspace/Begin/images/copy.jpg";
		FileInputStream fis= new FileInputStream(fname);
		byte data[]= new byte[1000];
		FileOutputStream fos = new FileOutputStream(target);
		int n=0,total=0,count=0;
		while((n=fis.read(data))!=-1) {
			fos.write(data,0,n);
			fos.flush(); //스트림에 남아있는 데이터가 있으면 밀어내준다
			count++;
			total+=n;
		}
		System.out.println(count+"번 반복");
		System.out.println(target+"에"+total+"byte만큼 썻어요");
		fos.close();
	}
}
