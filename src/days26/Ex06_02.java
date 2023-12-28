package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 12:21:53
 * @subject	[javaPro 모든 하위 폴더, 파일 목록 정보 조회]
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
//		System.out.println(currentDirectory);
		File parent = new File(currentDirectory);
		
		/*
		String[] list = parent.list();
		for (int i = 0; i < list.length; i++) {
			File f = new File(parent, list[i]);
			System.out.printf("%s\t%s\t%d\n", f.isDirectory() ? "[폴더]" : "파일"
				, f.getName(), f.length());
		} // for
		*/
		
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			String 수정날짜 = sdf.format(new Date(list[i].lastModified()));
//			Date d = new Date(list[i].lastModified());
//			LocalDateTime ldt = LocalDateTime.ofInstant(d.toInstant(), ZoneId.of("Asia/Seoul"));
//			System.out.println("ldt = " + ldt);
			System.out.printf("%s\t%s\t%d\t%s\n", list[i].isDirectory() ? "[폴더]" : "파일"
				, list[i].getName(), list[i].length(), 수정날짜);
		} // for
	}

}
