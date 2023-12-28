package days05;

import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 4:08:57
 * @subject
 * @content
 */
public class Ex07 {
	public static void main(String[] args) throws IOException {
		int code;
		char one;
		// 1)
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		// System.out.printf("code = %d\n", code);
		one = (char) code;
		System.out.printf("one = %c\n", one);
//		
		
		// System.in.skip(2) // 두번 건너뜀
		System.in.skip(System.in.available());
		
		// 2)
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		// System.out.printf("code = %d\n", code);
		one = (char) code;
		System.out.printf("one = %d\n", (int)one);
		
		
//		System.out.print("> 한 문자 입력 ? ");
//		while((code = System.in.read()) != -1) {
//			if(code == 13 || code == )
//			System.out.print("> 한 문자 입력 ? ");
//			one = (char) code;
//			System.out.printf("one = %d\n", (int)one);
//		}
	}
}
