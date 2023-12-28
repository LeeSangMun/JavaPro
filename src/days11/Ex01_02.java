package days11;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 8:59:08
 * @subject 10일차 복습
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max = m[0];
		
		for (int i = 0; i < m.length; i++) {
			if(max < m[i]) max = m[i];
		} // for
		
		System.out.printf("max = %d\n", max);
		
		int[] maxIndexArr = new int[m.length];
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if(max == m[i]) maxIndexArr[index++] = i;
		} // for
		
		System.out.println(Arrays.toString(maxIndexArr));
		
//		String.join(, );
		int[] arr = Arrays.copyOf(maxIndexArr, index);
		System.out.println(Arrays.toString(arr));
	}
}
