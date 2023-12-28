package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오전 11:25:23
 * @subject
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		// 배열 에러
//		int[] m = new int[2];
		// java.lang.NullPointerException
		int[] m = null;
		// java.lang.ArrayIndexOutOfBoundsException
		m[2] = 100;
		System.out.println(m[2]);
	}
}
