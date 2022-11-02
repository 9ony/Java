package day10;

import java.util.*;
import java.io.*;
/*Map계열
 * xxx.properties 유형의 파일을 읽어서 해당 파일에 젖아된 내용을
 * 자바로 옮기고자 할때 사용한다.
 */
public class PropertiesTest {

	public static void main(String[] args)
	throws FileNotFoundException,IOException
	{
//		String loc="C:\\myjava\\workspace\\Begin\\src\\day10\\database.properties";//절대경로
		String loc="src/day10/database.properties";//상대경로
		Properties prop=new Properties();
		InputStream is=new FileInputStream(loc);
		prop.load(is);
		//
		String type=prop.getProperty("DbType");
		System.out.println(type);
		
		String url=prop.getProperty("DbUrl");
		System.out.println(url);
		
		System.out.println(prop.getProperty("DbUser")+"/"+prop.getProperty("DbPwd"));
		
		System.out.println(prop.getProperty("msg","즐거운 하루 되세요~~"));
	}

}
