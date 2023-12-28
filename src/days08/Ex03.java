package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오전 11:06:18
 * @subject 7일차복습 (3)
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {

		int firTerm = 1;
		int secTerm = 1;
		int nextTerm = 0;
		int sum = firTerm + secTerm;

		System.out.printf("%d+%d+", firTerm, secTerm);

		for (int i = 0; i < 8; i++) {
			nextTerm = firTerm + secTerm;
			System.out.printf(i == 7 ? "%d" : "%d+", nextTerm);
			sum += nextTerm;
			firTerm = secTerm;
			secTerm = nextTerm;
		}

		System.out.printf("=%d\n", sum);

	}
}
