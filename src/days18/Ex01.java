package days18;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author sangmun
 * @date 2023. 8. 4. - 오후 5:29:45
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 오름차순
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		// 내림차순
		
		// [1]
		/*
		int[] temp = new int[m.length];
		for (int i = m.length-1; i >=0; i--) {
			temp[4-i] = m[i];
		} // for
		System.out.println(Arrays.toString(temp));
		*/
		
		// The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		// Arrays.sort(m, Collections.reverseOrder());
		// System.out.println(Arrays.toString(m));
		
		// int[] -> Integer[] 변환
		Integer[] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println(Arrays.toString(temp));
	}

}
