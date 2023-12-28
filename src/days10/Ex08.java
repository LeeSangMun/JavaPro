package days10;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 4:42:51
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		int[] score = new int[20];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*101);
		} // for
		
		System.out.println(Arrays.toString(score));
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.printf("max=%d, min=%d\n", max, min);
		
//		max = IntStream.of(score).max().getAsInt();
//		min = IntStream.of(score).min().getAsInt();
//		sum = IntStream.of(score).sum();
//		double avg = IntStream.of(score).average().getAsDouble();
	}
}
