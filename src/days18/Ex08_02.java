package days18;

import java.io.File;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 2:35:38
 * @subject
 * @content
 */
public class Ex08_02 {
	
	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		String sep = System.getProperty("file.separator");
		
		String directory = "C:\\temp\\days09\\";
		String fileName = "Ex01.java";
		
		String path = "";
		String suffix = "\\";
		if(directory.endsWith(suffix)) {
			path = directory + fileName;
		} else {
			path = directory + suffix + fileName;
		}
		
		System.out.println(path);
	}

}
