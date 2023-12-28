package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 2:15:58
 * @subject
 * @content
 */
public class Ex06_04 {
	public static void main(String[] args) {
		// days26 폴더 안에 있는 모든 파일을 검색해서
		// "fileName" 문자열을 찾아서 파일명과 라인번호를 출력.
		
		String pathname = ".\\src\\days26";
		String keyword = "fileName";
		
		File parent = new File(pathname);
		File[] list = parent.listFiles();
		
		File f = null;
		String line = null;
		int lineNumber = 1;
		for (int i = 0; i < list.length; i++) {
			f = list[i];
			lineNumber = 1;
			String fileName = f.getName();
			System.out.println("-----"+fileName+"------");
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
				while ((line = br.readLine()) != null) {
					line = line.replaceAll(keyword, "["+keyword+"]");
					if (line.contains(keyword)) {
						System.out.printf("%d : %s\n", lineNumber, line);
					}
					lineNumber++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // for
	}
}
