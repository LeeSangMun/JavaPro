package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 12:24:17
 * @subject	시험 문제
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		// 1+2+...+10=55
		// 스위치 변수 선언 코딩
		boolean sw = false;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			int n = i % 2 == 0 ? -i : i;
//			System.out.printf("%d +", n);
			// System.out.printf(i%1==0 ? "%d+" : "%d-", i);
//			sum += n;
			
			/*
			if(sw) {
				sum -= i;
				System.out.printf("%d+", i);
//				sw = false;
			} else {
				sum += i;
				System.out.printf("%d-", i);
//				sw = true;
			}
			*/
			
			sum += sw ? -i : i;
			System.out.printf(sw ? "%d+" : "%d-", i);
			sw = !sw;
		}
		System.out.printf("\b=%d", sum);
	}
}
