package days23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 5:25:11
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// [Properties]
		// Hashtable과 동일
		// Map 
		// Hashtable<String, String>
		// 환경설정값들을 Properties 클래스를 사용해서 쓰기/읽기 가능
		
		
		Properties p = new Properties();
		
		// ???.properties 확장자
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		try(FileReader reader = new FileReader(fileName)) {
			p.load(reader);
			
			String className = p.getProperty("className");
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			System.out.println(className);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			
			System.out.println(" Load End. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
