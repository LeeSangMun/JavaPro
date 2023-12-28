package days04;

import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 12:28:22
 * @subject	for문
 * @content	
 */
public class Ex05 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		System.out.printf("=%d", sum);
	}
}
