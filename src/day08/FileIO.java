package day08;
import java.io.*;
import javax.swing.*;
//파일을 읽어 콘솔에 출력
//[1] try~catch
//[2] throw
public class FileIO {
	public static String reading(String fileName) {
		System.out.println("---"+fileName+"----");
		String contents="";
		FileReader fr=null;
		char[] data=new char[4000];
		try {
		fr=new FileReader(fileName);
		//파일과 노드연결
		//FileNotFoundException
		fr.read(data,0,4000);
		//파일을 읽어서 그 내용을 data배열에 담는다.
		//IOException
		fr.close();
		//파일 리소스 반환
		//IOExceoption
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을수 없습니다.");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("파일을 찾을수 없습니다.");
			e.printStackTrace();
		}
		contents=new String(data);
		
		return contents;
	}

	public static void main(String[] args) {
		String fname=JOptionPane.showInputDialog("읽을 파일명을 입력하세요.");
		if(fname==null) return;
		String str=reading(fname);
		System.out.println(str);
		System.out.println("파일 길이= "+str.length());
	}

}
