package days06;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 3:30:04
 * @subject
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		// 이름 붙은 반복문 break, continue
		outer: for (int i = 2; i <= 9; i++) {
			inner: for (int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%02d ", i, j, i * j);
				if (j == 5) {
					break outer;
				}
			} // for
			System.out.println();
		} // for
	}
}
