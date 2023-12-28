package days23;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 5:06:34
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// [Properties]
		// Hashtable과 동일
		// Map 
		// Hashtable<String, String>
		// 환경설정값들을 Properties 클래스를 사용해서 쓰기/읽기 가능
		
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		// ???.properties 확장자
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		String comments = "jdbc configuration";
		try(FileWriter writer = new FileWriter(fileName)) {
			p.store(writer, comments);
			System.out.println(" Save End. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
