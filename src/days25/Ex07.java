package days25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 2:00:07
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		String parent = ".\\src\\days25";
		String child = "Ex01.java";
		File f = new File(parent, child);
		 */
		
		// 상대경로
		String pathName = ".\\src\\days25\\Ex01.java";
		
		// File 클래스 : 파일, 폴더(디렉토리)를 다루는 클래스
		File file = new File(pathName);
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		long fileLength = file.length();
		System.out.printf("> 파일 크기 : %d(byte)\n", fileLength);

		try(FileReader fr = new FileReader(file)) {
			int code;
			
			// 라인단위로 처리하는 보조스트림사용하면 라인번호 앞에
			// 붙일 때 더 코딩이 편해질거다.
			while((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
