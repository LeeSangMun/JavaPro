package days11;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 12:28:02
 * @subject
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		
//		bubbleSort(m);
//		selectionSort(m);
		selectionSort2(m); 
	}
	
	// selectionSort()보다 더 나은 선택정렬
	private static void selectionSort2(int[] m) {
		System.out.println("변경전 > " + Arrays.toString(m));		
		
		for (int i = 0; i < m.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < m.length; j++) {
				if(m[minIndex] > m[j]) {
					minIndex = j;
					System.out.println(i + " " +minIndex);
				}
			} // for
			int temp = m[i];
			m[i] = m[minIndex];
			m[minIndex] = temp;
		} // for
		System.out.println("변경후 > " + Arrays.toString(m));
	}


	// 0	1	2	3	4	index
	// 2	5	3	4	1	element
	private static void selectionSort(int[] m) {
		System.out.println("변경전 > " + Arrays.toString(m));
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = i+1; j < m.length; j++) {
				if(m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			} // for
		} // for
		
		System.out.println("변경후 > " + Arrays.toString(m));
	}

	public static void bubbleSort(int[] m) {
		System.out.println(Arrays.toString(m));
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j <= 4-i; j++) {
//				System.out.printf("%d-%d ", j, j+1);
//				if(m[j] < m[j+1]) {	// 내림차순
				if(m[j] > m[j+1]) {
//					System.out.print("***");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			} // for
			System.out.println();
		} // for
		
		boolean flag = false;
		
		for (int i = 0; i < m.length-1; i++) {
			flag = false;
			for (int j = 0; j < m.length-i-1; j++) {
				if(m[j] > m[j+1]) {
					int temp = m[j];	
					m[j] = m[j+1];
					m[j+1] = temp;
					flag = true;
				}
			} // for
			if(!flag) {
				break;
			}
		} // for
		
		System.out.println(Arrays.toString(m));
	}
}
