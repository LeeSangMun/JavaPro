package days04;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 2:24:11
 * @subject
 * @content
 */
public class Ex06_03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%d+", i);

			sum += i;
		}

		System.out.printf("\b=%d" , sum);
	}
}
