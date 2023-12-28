package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오전 11:10:41
 * @subject	지역변수 개념
 * @content
 * 
 * 		함수 호출 + 매개변수 가지고
 * 		1) Call By Name			// ex) drawLine()
 * 		2) Call By Value			// 매개변수에 값을 넘기는 것 ex) swap(10, 20)
 * 		3) Call By Reference		
 * 		4) Call By Point			// C언어
 */
public class Ex04 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		/*
		int temp = x;
		x = y;
		y = temp;
		*/
		
		swap(x, y);
		
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	public static void swap(int x, int y) {
		System.out.printf("> swap before x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("> swap after x=%d, y=%d\n", x, y);
	}
}
