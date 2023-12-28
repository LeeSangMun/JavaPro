package days17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 4. - 오후 4:48:51
 * @subject	파일을 읽어서 출력. + try~catch~finally문
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";
		// Unhandled exception type FileNotFoundException
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			int one;

			while ((one = fr.read()) != -1) {
				System.out.print((char) one);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
