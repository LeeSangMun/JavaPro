package days10;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 2:40:36
 * @subject	카드 섞기
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		int[] m = new int[10];
		
		for(int i=0; i<m.length; i++) {
			m[i] = i+1;
		}
		System.out.println(Arrays.toString(m));
		
		shuffle(m);
		
		System.out.println(Arrays.toString(m));
	}

	//[1] 풀이 - (문제점) 바꾸는 값이 같으면 바꿔야 하는게 문제
	/* 
	private static void shuffle(int[] m) {
		for(int i=0; i<m.length; i++) {
			int n = (int)(Math.random()*m.length);
			
			if(i == n)  {
				i--;
				continue;	
			}
			
			int temp = m[i];
			m[i] = m[n];
			m[n] = temp;
		}
		
	}
	*/
	
	// [2] 문제점 횟수가 작으면 잘 섞이지 않음
	private static void shuffle(int[] m) {
		int idx, temp;
		
		for(int i=0; i<10; i++) {
			idx = (int)(Math.random()*9) + 1;
			
			temp = m[0];
			m[0] = m[idx];
			m[idx] = temp;
		}
		
	}
}
