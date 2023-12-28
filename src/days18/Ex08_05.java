package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 4:13:32
 * @subject
 * @content
 */
public class Ex08_05 {
	public static void main(String[] args) {
		String userDir = System.getProperty("user.dir");
		// System.out.println(userDir);
		String path = userDir.concat("\\src\\days18\\SS19.txt");
		// System.out.println(path);
		
		/*
		try (FileReader fr = new FileReader(path)) {
			int code;
			while((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		String[] nameArr = new String[20];
		int index = 0;
		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)) {
			String name;
			while((name = br.readLine()) != null) {
//				System.out.printf("%s\n", name);
				nameArr[index++] = name;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String nameTags = "<ol><li>".concat(String.join("</li><li>", nameArr)).concat("</li></ol>");
		
		System.out.println(nameTags);
	}
}
