package days06;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 12:46:45
 * @subject
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		// 구구단 while문 사용
		int dan = 2;
		int i = 1;
		while (dan <= 9) {
			i = 1;
			System.out.printf("[%d]\n", dan);
			while(i <= 9) {
				System.out.printf("%dx%d=%d\n", dan, i, dan*i);
				i++;
			}
			
			dan++;
		}
	}
}
