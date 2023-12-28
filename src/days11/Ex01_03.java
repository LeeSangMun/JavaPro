package days11;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 8:59:08
 * @subject 10일차 복습
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		/*
		int max = m[0], maxCount = 1;
		for (int i = 1; i < m.length; i++) {
			if(max == m[i]) {
				maxCount++;
			} else if(max < m[i]) {
				max = m[i];
				maxCount = 1;
			}
		} // for
		*/
		
		int[] mcArr = getArrayMaxAndCount(m);
		
		System.out.printf("> max:%d, maxCount:%d\n", mcArr[0], mcArr[1]);
	}

	private static int[] getArrayMaxAndCount(int[] m) {
		int max = m[0], maxCount = 1;
		for (int i = 1; i < m.length; i++) {
			if(max == m[i]) {
				maxCount++;
			} else if(max < m[i]) {
				max = m[i];
				maxCount = 1;
			}
		} // for
		int mc[] = new int[2];
		mc[0] = max;
		mc[1] = maxCount;
		return mc;
		
//		return new int[] {max, maxCount};
	}
}
