package day08;
import java.io.*;
import javax.swing.*;
//파일을 읽어 콘솔에 출력
//[1] try~catch
//[2] throw
public class FileIO2 {
	public static String reading(String fileName) 
	throws FileNotFoundException,IOException
	{
		System.out.println("---"+fileName+"----");
		String contents="";
		FileReader fr=null;
		char[] data=new char[1000];
		try {
		fr=new FileReader(fileName);
		//파일과 노드연결
		
		fr.read(data,0,1000);
		//파일을 읽어서 그 내용을 data배열에 담는다.
		
		fr.close();
		//파일 리소스 반환
		
		contents=new String(data);
		
		}catch(Exception e){
			
		}
		return contents;
	}

	public static void main(String[] args)
	throws IOException
	{
		String fname=JOptionPane.showInputDialog("읽을 파일명을 입력하세요.");
		if(fname==null) return;
		String str=reading(fname);
		System.out.println(str);
	}
}