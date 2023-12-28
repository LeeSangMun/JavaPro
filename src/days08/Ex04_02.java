package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오전 11:21:36
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
//		int x = 10, y = 20;
		int[] m = {10, 20};
		
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
		
		// 매개변수를 참조타입으로 사용
		swap(m);
		
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
	}

	public static void swap(int[] m) {
		System.out.printf("> swap before x=%d, y=%d\n", m[0], m[1]);
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		System.out.printf("> swap after x=%d, y=%d\n", m[0], m[1]);
	}
	
	/*
	public static void swap(int x, int y) {
		System.out.printf("> swap before x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("> swap after x=%d, y=%d\n", x, y);
	}
	*/
}
