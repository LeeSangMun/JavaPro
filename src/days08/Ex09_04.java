package days08;

import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 4:31:12
 * @subject
 * @content
 */
public class Ex09_04 {
	public static void main(String[] args) {
		new Random()
			.ints(1, 46)
			.distinct()
			.limit(6)
			.sorted()
			.forEach(System.out::println);
	}
}
