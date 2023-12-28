package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 2:29:46
 * @subject
 * @content
 */
public class Ex09_03 {

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
		// (1)  int[] numCounts = new int[10];
		int[][] counts = new int[3][];
		counts[0] = new int[26];
		counts[1] = new int[26];
		counts[2] = new int[10];
		
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
				} else if(Character.isDigit(one)) {
					counts[2][one-'0']++;
				}
				// (1)
//				else if(Character.isDigit(one)) {
//					numCounts[one-'0']++;
//				}
			}
			
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자\n", i==0?'대':i==1 ? '소' : '숫');
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d) : %s\n", i==0?j+'A': i==1 ? j+'a' : j+'0', counts[i][j], "#".repeat(counts[i][j]));
				} // for
			} // for
			
//			System.out.println("숫자");
//			for (int i = 0; i < numCounts.length; i++) {
//				System.out.printf("%d(%d) : %s\n", i, numCounts[i], "#".repeat(numCounts[i]));
//			} // for
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
