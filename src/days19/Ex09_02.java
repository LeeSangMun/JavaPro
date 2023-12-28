package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 2:29:42
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
        // days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자를 구분하지 않고 
		// 배열에 저장 후 ### 막대그래프를 작성
		
		// 상대경로
		// .(현재디렉토리)
		// ..(상위디렉토리)
		String path = ".\\src\\days19\\Ex01.java";	 
//		int[] counts = new int[26];
		// 0행 : 대문자, 1행 : 소문자
		int[][] counts = new int[2][26];
		
		try(FileReader fr = new FileReader(path)) {
			int code;
			char one;
			while((code = fr.read()) != -1) {
//				System.out.printf("%c", code);
				
				one = (char)code;
				if(Character.isUpperCase(one)) {
					counts[0][one-'A']++;
				} else if(Character.isLowerCase(one)) {
					counts[1][one-'a']++;
				}
			}
			
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자\n", i==0?'대':'소');
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d) : %s\n", i==0?j+'A':j+'a', counts[i][j], "#".repeat(counts[i][j]));
				} // for
			} // for
			
			/*
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%d) : %s\n", i+'A', counts[i], "#".repeat(counts[i]));
			} // for
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
