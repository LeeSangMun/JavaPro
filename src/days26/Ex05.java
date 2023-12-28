package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.stream.Stream;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 10:36:53
 * @subject	PipedReader / PipedWriter
 * @content	스레드 간에 데이터를 입/출력할 때 사용하는 스트림
 * 					[RandomAccessFile]
 * 					파일 읽기, 쓰기 스트림
 * 					파일 어느 위치에나 읽기/쓰기가 가능한 장점이 잇는 스트림.
 * 
 * 					- seek()
 * 					- getFilePointer() // 현재위치
 * 
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		String s = "I love nornal Java";
		String q = "javabook";
		
		String name = ".\\src\\days26\\random.txt";
		String mode = "rw";
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.writeBytes(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			// 임의의 위치로 이동 - 읽기/쓰기();
			raf.seek(7);
			raf.writeBytes(q);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			// 임의의 위치로 이동 - 읽기/쓰기();
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
