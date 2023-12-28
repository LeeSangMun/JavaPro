package util;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 4:08:45
 * @subject
 * @content
 */
public class Draw2D {
	// 2D 그리기 작업할 수 있는 모든 기능들을 구현한 클래스
	public static void drawLine() {
		System.out.println("--------------");
	}
	
	// Duplicate method drawLine() in type Ex08_02
	public static void drawLine(int n) {
		System.out.println("-".repeat(n));
	}
	
	public static void drawLine(int n, char style) {
		System.out.println((style+"").repeat(n));
	}
}
