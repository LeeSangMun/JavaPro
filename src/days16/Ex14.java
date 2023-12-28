package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오후 3:43:38
 * @subject
 * @content
 */
public class Ex14 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		
		// JVM의 예외처리기에 의해서
		// java.util.InputMismatchException 예외 객체 생성 -> 개발자 파악 예외 처리
		
		
		try {
			System.out.print("> a,b 두 정수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			double c = a / b;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
			System.out.println("=정상 종료=");
			
			// 다중 catch 문
			// (주의사항) 부모 예외 클래스를 밑에 코딩한다.
		} catch(InputMismatchException e) {
			System.out.println("> [알림] 정수만 입력 하세요...");
//			System.exit(0);
		} catch(ArithmeticException e) {
			System.out.println("> [알림] 0으로 나룰 수 없습니다.");
//			System.exit(0);
		} catch(Exception e) {
			e.printStackTrace();
//			System.exit(0);
		} finally {
			// 예외가 발생 유무 상관없이 처리할 구문
			System.exit(0);
		}
		
		
		
		/*
		String input = "1 fish 2 fish red fish blue fish";
		Scanner sc = new Scanner(input).useDelimiter("\\s*finsh\\*s");
		*/
	}

}
