package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 4. - 오후 5:19:05
 * @subject	BufferedReader
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";
		// Unhandled exception type FileNotFoundException
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String line;

			int lineNumber = 1;
			while ((line = br.readLine()) != null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
