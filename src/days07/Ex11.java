package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 4:39:33
 * @subject
 * @content
 */
public class Ex11 {
	public static void main(String[] args) {
		int[] a = {10, 20};
		
		System.out.printf(">변경 전 x=%d, y=%d\n", a[0], a[1]);
		
		swap(a);

		System.out.printf(">변경 후 x=%d, y=%d\n", a[0], a[1]);
	}
	
	public static void swap(int[] a) {
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
}
