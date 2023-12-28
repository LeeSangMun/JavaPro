package days06;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 12:36:46
 * @subject
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			System.out.printf("[%d단]\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%dx%d=%2d\n", dan, i, dan*i);
			} // for
		} // for
	}
}
