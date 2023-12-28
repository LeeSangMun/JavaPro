package days12;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 28. - 오전 11:05:29
 * @subject 이진검색
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 86, 91,
				94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 169, 172, 181, 184,
				185, 191, 198 };
		System.out.println(Arrays.toString(m));

		int n = 5;

		int index = binarySearch(m, n);

		if (index == -1) {
			System.out.println("찾는 정수는 없다.");
		} else {
			System.out.println(index + "위치에 있다.");
		}
	}

	private static int binarySearch(int[] m, int n) {
		int bottom = 0;
		int top = m.length-1;
		int middle;
		int count = 0;
		
		while(bottom <= top) {
			count++;
			middle = (bottom + top)/2;
			if(m[middle] == n) {
				System.out.println("찾은 횟수 : " + count);
				return middle;
			} else if(n < m[middle]) {
				top = middle - 1;
			} else {
				bottom = middle+1;
			}
		}
		System.out.println("> 못찾은 횟수 : " + count);
		
		/*
		while(top != bottom) {
			if(m[middle] == n) {
				return middle;
			} else if(n < m[middle]) {
				top = middle - 1;
				middle = (bottom + top)/2;
			} else if(n > m[middle]) {
				bottom = middle+1;
				middle = (bottom + top)/2;
			} else if(top == bottom) {
				return top;
			}
		}
		*/
		
		return -1;
	}
}
