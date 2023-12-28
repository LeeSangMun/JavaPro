package days10;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 12:31:29
 * @subject
 * @content
 */
public class Ex03_03 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int[] arrCopy = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));
		
		int[] m = new int[3];
		m[0] = 5;
		m[1] = 3;
		m[2] = 7;

		int index = 3;
		if(index == m.length) {
			int[] temp  = new int[m.length+3];
			
			System.arraycopy(m, 0, temp, 0, m.length);
			m = temp;
		}
		
		m[3] = 10;
		System.out.println(Arrays.toString(m));
		
	}
}
