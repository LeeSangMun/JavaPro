package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오후 4:29:02
 * @subject	[중첩 try~catch문]
 * @content
 */
public class Ex14_03 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
	
		try {
			System.out.print("> a,b 두 정수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			try {
				double c = a / b;
				System.out.printf("%d / %d = %.2f\n", a, b, c);
				System.out.println("=정상 종료=");
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			
		} catch(InputMismatchException e) {
			System.out.println(" [1]\n" + e.toString());
			System.out.println(" [2]\n" + e.getMessage());
//			System.exit(0);
		} catch(Exception e) {
			e.printStackTrace();
//			System.exit(0);
		} finally {
			// 예외가 발생 유무 상관없이 처리할 구문
			System.exit(0);
		}
	}

}
