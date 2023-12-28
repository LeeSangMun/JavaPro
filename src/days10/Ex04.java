package days10;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 2:01:27
 * @subject	배열 삽입
 * @content
 */
public class Ex04 {
	

	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		int index = 2;
		int n = 100;
		
		// [1]
		/*
		int[] temp = new int[m.length+1];
		System.arraycopy(m, 0, temp, 0, index);
		temp[index] = 100;
		System.arraycopy(m, index, temp, index+1, m.length-index);
		m = temp;
		System.out.println(Arrays.toString(m));
		*/
		
		// [2]
		int[] temp = new int[m.length+1];
		for(int i=0; i<m.length; i++) {
			if(index > i) {
				temp[i] = m[i];
			} else if(index<=i) {
				temp[i+1] = m[i]; 
			}
		}
		temp[index] = 100;
		m = temp;
		
		System.out.println(Arrays.toString(m));
		
		/*
		int[] result = new int[m.length+1];
		System.arraycopy(m, 0, result, 0, m.length);
		
		for(int i=result.length-2; i>=index; i--) {
			result[i+1] = result[i];
		}
		result[index] = 100;
		System.out.println(Arrays.toString(result));
		*/
	}
}
