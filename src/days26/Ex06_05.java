package days26;

import java.io.File;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 2:33:16
 * @subject
 * @content
 */
public class Ex06_05 {

	public static void main(String[] args) {
		// days26 폴더 안에 upload 폴더 유무 확인 후
		// 없으면 폴더 생성
		String patname = ".\\src\\days26";
		File dir = new File(patname, "upload");
		// createNewFile() : 파일 새로 생성. 이미 생성할 파일이 존재하면 false
		// createTempFile() : 임시 파일 생성
		//				c:\\window\\TEMP <- 여기에 파일이 생성
		// delete() : 파일 삭제
		// deleteOnExit() : 응용 프로그램이 종료할 때 파일 삭제
		// renameTo(File) : 파일명을 변경
		// mkdir() : 폴더 생성
		// mkdirs() : 폴더들 생성. 부모 폴더까지 생성
		if(!dir.exists()) {
			System.out.println(dir.mkdir());
		} else {
			System.out.println("delete" + dir.delete());
		}
	}

}
