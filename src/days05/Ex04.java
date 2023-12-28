package days05;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 2:01:39
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		// 1~10=55
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		System.out.printf("\b=%d\n", sum);
		*/
		
		// 2) 홀수의 합
		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				System.out.printf("%d+", i);
				sum += i;
			}
		}
		
		System.out.printf("\b=%d\n", sum);
		*/
		
		// 3) 
		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
				
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum);
		*/
		
		// 4) 
		int sum = 0;
		for(int i=1; i<=10; i+=2) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum);
		
		// 5) 1~n 까지 합 출력
		/*
		int n = 5;
		int sum = 0;
		for(int i=1; i<=n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum);
		*/
	}
}
