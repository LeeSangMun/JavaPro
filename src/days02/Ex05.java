package days02;

/**
 * @author sangmun
 * @date 2023. 7. 14. - 오전 11:04:43
 * @subject 	표준 입력, 표준 출력 => System 클래스 필요
 * @content	객체 == 개체 == Object == 클래스 == 물건
 * 					System 클래스 안에 [표준 출력 함수]
 * 					1. println()
 * 					2. printf()
 * 						PrintStream printf(String format, Object ... args)
 * 					3. print()
 */
public class Ex05 {
	public static void main(String[] args) {
		// 함수 파악
		// 1. 함수의 기능 파악
		// 2. 함수가 일처리를 할 때 필요한 값 파악 (매개변수, 파라미터, 인자, 인수)
		// 3. 함수가 일처리를 한 후에 반환하는 값 파악 (리턴값)
		
		System.out.println("이상문");
		System.out.println("이상문");
		System.out.println("이상문");
		
		System.out.print("이상문" + '\n');
		System.out.print("이상문\n");
		System.out.println();
		System.out.print("이상문");
	}
}
