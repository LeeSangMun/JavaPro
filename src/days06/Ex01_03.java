package days06;

import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오전 10:40:41
 * @subject	람다 스트림
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
		int max = new Random().ints(5, 16).limit(10).max().getAsInt();
		System.out.println(max);
		
		/*
		int a = 5, b = 7, c = 1;		
		
		// 1)
		int max = IntStream.of(a, b, c).max().getAsInt();
		System.out.println(max);
		
		// 2) 메서드 참조
		IntStream.of(a, b, c).max().ifPresent(System.out::println);
		*/
	}
}
