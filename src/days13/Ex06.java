package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오후 2:08:45
 * @subject
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		// 좌표점 20개 쓰기 + 읽기
		
		int x = 10, y = 20;
		
		dispXY(x, y); // Call By Value
	}

	private static void dispXY(int x, int y) {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	// The variable argument type int of the method dispXY must be the last parameter
	// 가변인자를 여러 개 사용x
	// 가변인자는 last parameter로 선언해서 사용
	/*
	private static void dispXY(int...x, int...y) {
		
	}
	*/
}
