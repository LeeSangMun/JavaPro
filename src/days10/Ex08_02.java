package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 5:11:56
 * @subject
 * @content
 */
public class Ex08_02 {
	public static void main(String[] args) {
		int[] score = new Random().ints(20, 0, 101).toArray();
		
		System.out.println(Arrays.toString(score));
	}
}
