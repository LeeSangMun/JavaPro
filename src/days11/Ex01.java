package days11;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 8:59:08
 * @subject 10일차 복습
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max = IntStream.of(m).max().getAsInt();
		System.out.printf("max = %d\n", max);
		
		/*
		int maxCount = 0;
		for (int i = 0; i < m.length; i++) {
			if(m[i] == max) maxCount++;
		} // for
		*/
		
		
		int maxCount = (int)IntStream.of(m).filter(i -> i == max).count();
		System.out.println("maxCount = " + maxCount);
		
		for (int i = 0; i <maxCount; i++) {
			
		} // for
	}
}
