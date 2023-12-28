package days06;

import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오전 11:01:49
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) throws IOException {
		int code;
		/*
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("one = %c\n", (char)code);

		System.in.skip(System.in.available());

		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("one = %c\n", (char)code);
		*/
		
		// Syntax error on token "continue", invalid VariableDeclaratorId
		char con  = 'y';
		
		do {
			System.out.print("> 한 문자 입력 ? ");
			code = System.in.read();
			System.out.printf("one = %c\n", (char)code);
			
			System.in.skip(System.in.available());
			
			System.out.print("\n\n 계속할거냐? ");
			code = System.in.read();
			con = (char)code;
			
			System.in.skip(System.in.available());
		} while(con == 'y' || con == 'Y');
		
		System.out.println("end");
	}
}
