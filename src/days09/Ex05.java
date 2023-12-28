package days09;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오후 4:29:45
 * @subject	배열
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		/*
		 * [배열]
		 * 
		 */
		
		int[] kors = new int[3];
		
		/*
		// 100점으로 초기화
		for(int i=0; i < kors.length; i++) {
			kors[i] = 100;
		}
		*/
//		Arrays.fill(kors, 100);
		
		// java.lang.NullPointerException
		kors = null;	
		
		dispkors(kors);
	}

	public static void dispkors(int[] kors) {
		for(int i=0; i < kors.length; i++) {
			System.out.printf("kors[%d]=%d\n", i, kors[i]);
		}
	}
}
