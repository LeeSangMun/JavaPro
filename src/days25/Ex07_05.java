package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 3:49:33
 * @subject	실행파일 복사(바이트 스트림 사용)
 * @content
 */
public class Ex07_05 {


	public static void main(String[] args) {
		String pathName = "C:\\UKLog.dat";
		String copyPathName = "C:\\Users\\user\\Documents\\UKLog.dat";

		// > 복사 처리 시간 (ns) : 2285013800(ns)
//		fileCopy_byteStream(pathName, copyPathName);
		// > 복사 처리 시간 (ns) : 4295700(ns)
		fileCopy_byteStream02(pathName, copyPathName);
	}
	
	private static boolean fileCopy_byteStream02(String pathName, String copyPathName) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try(FileInputStream fis = new FileInputStream(pathName);
				FileOutputStream fos = new FileOutputStream(copyPathName, true);
				BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE)) {
			
			byte[] b = new byte[BUFFER_SIZE];
			int readChrrarNumber = 0;
			while ((readChrrarNumber = bis.read(b)) != -1) {
				bos.write(b, 0, readChrrarNumber );
			}
			bos.flush();
			System.out.println("파일 복사 완료!!!");
		
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 (ns) : %d(ns)\n", end-start);

			return true;
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	private static boolean fileCopy_byteStream(String pathName, String copyPathName) {
		long start = System.nanoTime();
		
		try(FileInputStream fis = new FileInputStream(pathName);
				FileOutputStream fos = new FileOutputStream(copyPathName, true);) {
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 (ns) : %d(ns)\n", end-start);

			return true;
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}


}
