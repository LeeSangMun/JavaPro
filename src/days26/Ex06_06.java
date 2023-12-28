package days26;

import java.io.File;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 2:51:34
 * @subject
 * @content
 */
public class Ex06_06 {

	public static void main(String[] args) {
		// days26
		//		ㄴ temp
		//				ㄴ temp_a
		//					ㄴ xxx
		//					ㄴ yyy
		//				ㄴ temp_b
		
		String pathname = ".\\src\\days26\\temp";
		File dir = new File(pathname);
//		deleteAll(dir);
		directoryDelete(dir);
//		if(dir.exists()) {
//			// 하위 디렉토리가 없어야 삭제할 수 있다.
//			System.out.println(dir.delete());	
//		}
	}
	
	private static void directoryDelete(File f) {
		// f 삭제되지 않았을 경우 while 반복
		while (!f.delete()) {
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if (list[i].delete()) {
					System.out.printf("%s 삭제 완료!!!\n", list[i]);
				} else {
					directoryDelete(list[i]);
				}
			} // for
		}
	}

	private static void deleteAll(File file) {
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				deleteAll(files[i]);			
			}
			files[i].delete();
		} // for
	}

}
