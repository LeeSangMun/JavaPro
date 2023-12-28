package days06;

import java.util.Arrays;
import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오전 10:11:52
 * @subject
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) {
		// 10개 정수를 임의의 값으로 저장
		// 가장 큰 값을 출력
		
//		Random rnd = new Random();
		
		int[] m = new int[10];
		for(int i=0; i< m.length; i++) {
			m[i] = (int)(Math.random()*11) + 5;
//			m[i] = new Random().nextInt(11) + 5;
			
//			System.out.print(m[i] + " ");
		}
		
		System.out.println(Arrays.toString(m));
		
		int max = m[0];
		int min = m[0];
		
		for (int i = 1; i < m.length; i++) {
			if(max < m[i]) {
				max = m[i];
			} else if(min > m[i]) {
				min = m[i];
			}
		} // for
		
		System.out.println("max = " + max + "\tmin = " + min);
	}
}
