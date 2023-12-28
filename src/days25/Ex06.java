package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 12:24:58
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// Properties
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		String fileName = ".\\src\\com\\util\\jdbc.xml";
		String comments = "jdbc configuration";
		try(FileOutputStream out = new FileOutputStream(fileName)) {
			p.storeToXML(out, comments);
			System.out.println(" Save End. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
