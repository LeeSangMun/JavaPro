package days25;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 3:19:05
 * @subject
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		// 파일 복사
		String pathName = ".\\src\\days25\\Ex01.java";
		String copyPathName = ".\\src\\days25\\Ex01_Copy.java";
		
		// > 복사 처리 시간 (ns) : 36921400(ns)
		fileCopy_textStream(pathName, copyPathName);
	}

	private static boolean fileCopy_textStream(String pathName, String copyPathName) {
		long start = System.nanoTime();
		
		try(FileReader fr = new FileReader(pathName);
				FileWriter fw = new FileWriter(copyPathName, true)) {
			int code;
			while ((code = fr.read()) != -1) {
				fw.write(code);
				System.out.println(code);
			}
			fw.flush();
			System.out.println("파일 복사 완료!!!");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 (ns) : %d(ns)\n", end-start);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

}
