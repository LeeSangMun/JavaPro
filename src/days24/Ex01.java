package days24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오전 8:44:15
 * @subject	23일차 복습
 * @content
 */
public class Ex01 {
	public static void main(String[] args) throws ParseException {
		String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
		
		ArrayList<MemberVO> teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap
					= new HashMap<>();
		String content = "";
		StringBuilder sb = new StringBuilder();
		String line = null;
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) {
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			content = sb.toString();
			System.out.println(content);
			
			String pattern = "{0}\r\n{1}\r\n"
					+ "{2}\r\n{3}\r\n"
					+ "{4}\r\n{5}\r\n";
			MessageFormat mf = new MessageFormat(pattern);
			Object[] data =  mf.parse(content);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
