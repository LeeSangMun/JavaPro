package days25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 2:42:58
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 실행 후
		// 1. 저장할 파일명 입력 ? 
		// 2. 저장할 문자열(Data) 입력 ? 
		//		계속 ? 
		
		String pathName = ".\\src\\days25\\sample.txt";
		File file = new File(pathName);
		// 파일의 존재 유무를 true,false 반환
//		System.out.println(file.exists());
		
		try(FileWriter fw = new FileWriter(file, false)) {
			/*
			fw.append('a').append("append_string");
			fw.write(98);
			fw.write("write_string");
			*/
			
			fw.write("새로 실행해서 텍스트 추가");
			System.out.println("End");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
