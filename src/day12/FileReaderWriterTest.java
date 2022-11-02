package day12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileReaderWriterTest {

	public static void main(String[] args) 
	throws Exception{
		String file=JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		//src/day12/ObjectInOut.java
		if(file==null) return;
		
		FileReader fr=new FileReader(file);
		FileWriter fw=new FileWriter("src/day12/copy4.txt"/*,true*/); //true넣을 경우 덮어씀
		
		File f=new File(file);//파일객체
		long fsize=f.length();
		System.out.println("읽을 파일 크기 "+fsize+"bytes");
		int n=0,total=0,count=0;
		char[] data=new char[1000];
		while((n=fr.read(data))!=-1) {
			System.out.println("n:"+n);
			fw.write(data, 0,n);
			fw.flush();
			count++;
			total+=n;
		}
		System.out.println("copy완료");
		System.out.println("바이트 수n : "+total);
		System.out.println("카운트 : "+count);
		fw.close();
		fr.close();

	}

}
