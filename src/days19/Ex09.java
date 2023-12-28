package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
        // days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자를 구분하지 않고 
		// 배열에 저장 후 ### 막대그래프를 작성
		
		// 상대경로
		// .(현재디렉토리)
		// ..(상위디렉토리)
		String path = ".\\src\\days19\\Ex01.java";	 
		int[] counts = new int[26];
		
		try(FileReader fr = new FileReader(path)) {
			int code;
			char one;
			while((code = fr.read()) != -1) {
//				System.out.printf("%c", code);
				one = (char)code;
				one = Character.toUpperCase(one);
				if(Character.isUpperCase(one)) {
					System.out.print(one);
					counts[one-'A']++;
				}
			}
			
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%d) : %s\n", i+'A', counts[i], "#".repeat(counts[i]));
			} // for
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
