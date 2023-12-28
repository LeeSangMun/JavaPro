package days26;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 11:45:36
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		// 1. 가장 많이 사용되는 입출력의 대상 
		// 2. 파일 - 디렉토리(폴더)
		String pathName = ".\\src\\days26\\Ex01.java";
//		String pathName = "E:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days26\\Ex01.java";
		File file = new File(pathName);
		// OS에서 사용하는 경로 구분자
		System.out.println(File.pathSeparator); // ;
		// OS에서 사용하는 이름 구분자
		System.out.println(File.separator); // \
		
		// 파일 이름
		String fileName = file.getName();
		System.out.println(fileName);
		
		// 확장자 .java
		// 확장자를 제외한 파일명
		int pos = fileName.indexOf(".");
		System.out.println(fileName.substring(0, pos));
		System.out.println(fileName.substring(pos));
		
		System.out.println(FileUtil.getExtension(fileName));
		System.out.println(FileUtil.getBaseName(fileName));
		
		System.out.println("-".repeat(50));
		
		System.out.println(file.getPath());					// 경로
		System.out.println(file.getAbsolutePath());		// 절대경로
		System.out.println(file.getCanonicalPath());	// 표준경로
		
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		
		// com.util.FileUtil.java
		
	}

}
