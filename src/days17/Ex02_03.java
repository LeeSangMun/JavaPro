package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 4. - 오후 5:26:02
 * @subject	
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";
		// Unhandled exception type FileNotFoundException
		
		try(FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);) {
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
		}
	}
}
