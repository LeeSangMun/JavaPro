package days26;

import java.io.File;
import java.io.FilenameFilter;

import com.util.FileUtil;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 2:01:25
 * @subject
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// days26 폴더 안에 java 파일 골라서 조회
		String pathname = ".\\src\\days26";
		File dir = new File(pathname);
//		String[] list = dir.list();
		/*
		File[] list = dir.listFiles();	
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile()) {
				String fileName = list[i].getName();
				if (fileName.endsWith(".dat")) {
					System.out.println(fileName);
				}
				
//				FileUtil.getExtension(fileName).equals(".java");
			}
		} // for
		*/
		
		// [2] 
		/*
		File[] list = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile()) {
				String fileName = list[i].getName();
				if (fileName.endsWith(".dat")) {
					System.out.println(fileName);
				}
				
//				FileUtil.getExtension(fileName).equals(".java");
			}
		} // for
		*/
		
		File[] list = dir.listFiles( (d,name) -> name.endsWith(".java"));
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		} // for
	}

}
