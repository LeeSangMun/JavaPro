package days11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 11:28:16
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		// 순차검색을 사용
		int max = 100;
		// max가 있는 위치(index) 모두 출력
		/*
		int beginIndex = 0;
		int index = sequentialSearch(m, max, 0);
		System.out.println("찾은 위치(index) : " + index);
		
		beginIndex = index + 1;
		index = sequentialSearch(m, max, 0);
		System.out.println("찾은 위치(index) : " + index);
		*/
		
		int beginIndex = 0;
		int index;
		boolean flag = false;
		
		while((index = sequentialSearch(m, max, beginIndex)) != -1) {
			System.out.println("찾은 위치(index) : " + index);
			beginIndex = index+1;
		}

		if(!flag) System.out.println("검색결과 X");
		
		/*
		for(int i=0; i<m.length; i++) {
			if(m[i] == max) {
				System.out.println(i);
			}
		}
		*/
		
		/*
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<m.length; i++) {
			if(m[i] == max) {
				list.add(i);
			}
		}
		System.out.println(list);
		*/
		
		
	}
	
	private static int sequentialSearch(int[] m, int n, int beginIndex) {
		for (int i = beginIndex; i < m.length; i++) {
			if(m[i] == n) {
				return i;
			}
		} // for
		return -1;
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
