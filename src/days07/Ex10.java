package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 4:14:01
 * @subject
 * @content
 */
public class Ex10 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 두 정수의 합을 구해서 반환하는 sum() 함수 선언 함수 호출
		int c = a + b;
		sum(a, b);
		
		System.out.printf("%d+%d=%d", a, b, c);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
