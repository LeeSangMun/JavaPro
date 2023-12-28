package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 3:19:05
 * @subject
 * @content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		// 파일 복사
		String pathName = ".\\src\\days25\\Ex01.java";
		String copyPathName = ".\\src\\days25\\Ex01_Copy.java";

		// > 복사 처리 시간 (ns) : 36921400(ns)
		fileCopy_textStream02(pathName, copyPathName);
	}

	private static boolean fileCopy_textStream02(String pathName, String copyPathName) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try(FileReader fr = new FileReader(pathName);
				FileWriter fw = new FileWriter(copyPathName, true);
				BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);
				BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE)) {
			String line = null;
			int lineNumber = 1;
			
			/*
			int code;
			while ((line = br.readLine()) !=	null) {
				bw.write(line);
				System.out.printf("%d : %s\n", lineNumber++, line);
			}
			*/
			
			char[] cbuf = new char[BUFFER_SIZE];
			int readChrrarNumber = 0;
			while ((readChrrarNumber = br.read(cbuf)) != -1) {
				bw.write(cbuf, BUFFER_SIZE, readChrrarNumber);
			}
			bw.flush();
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
