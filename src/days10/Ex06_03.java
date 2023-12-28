package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 3:47:09
 * @subject
 * @content
 */
public class Ex06_03 {
	public static void main(String[] args) {
		int[] tots = new int[10];
		int[] ranks = new int[10];
		
		Arrays.fill(ranks, 1);
		
		Random rnd = new Random();
		for (int i = 0; i < tots.length; i++) {
			int tot = rnd.nextInt(301);
			tots[i] = tot;
		} // for
		
		System.out.println(Arrays.toString(tots));
		
		for(int i=0; i<tots.length; i++) {
			ranks[i] = 1;
			for (int j = 0; j < tots.length; j++) {
				// if(i == j) continue;
//				if(tots[i] < tots[j] && i != j) {
				if(tots[i] < tots[j]) {
					ranks[i]++;
				}
			} // for
		}
		
		System.out.println(Arrays.toString(ranks));
	}
}
