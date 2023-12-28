package days11;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 10:44:07
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		
		int n = 4;
		int index = sequentialSearch(m, n);
		System.out.println("> index : " + index);
		
		int[] temp = new int[m.length+1];
		for(int i=0; i<m.length; i++) {
			/*
			if(i < index) {
				temp[i] = m[i];
			} else if(i >= index) {
				temp[i+1] =  m[i];
			}
			*/
			
			temp[index>i ? i : i+1] = m[i];
		}
		temp[index] = 100;
		m = temp;
		
		System.out.println(Arrays.toString(m));
		
	}

	private static int sequentialSearch(int[] m, int n) {
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) {
				return i;
			}
		} // for
		return -1;
	}
}
