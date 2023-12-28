package days10;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 2:28:48
 * @subject	배열 수정, 삭제
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 수정
		/*
		int index = 2;
		m[2] = 100;
		*/
		
		// 삭제
		/*
		int index = 2;
		int[] temp = new int[m.length-1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index+1, temp, index, m.length - index - 1);
		m = temp;
		*/
		
		
		int index = 2;
		int[] temp = new int[m.length-1];
		for(int i=0; i<m.length; i++) {
			if(i < index) {
				temp[i] = m[i];
			} else if(i > index) {
				temp[i-1] = m[i];
			}
		}
		m = temp;
		
		
		System.out.println(Arrays.toString(m));
	}
}
