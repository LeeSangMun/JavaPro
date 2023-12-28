package days05;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 3:13:00
 * @subject	while 조건반복문
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		// 열거자를 반복해서 처리
//		while (en.hasMoreElements()) {
//			type type = (type) en.nextElement();
//			
//		}
		
		// 반복자를 반복해서 처리
//		while (it.hasNext()) {
//			type type = (type) it.next();
//			
//		}
		
		
//		while (condition) {
//			// 조건식이 참일 동안 반복
//			// 
//		}
		
		// for문과 while문의 차이점
		// 1. 반복횟수가 있나 없나
		
		// 1~10까지 합
		
		// 1)
		/* 
		int i=1, sum=0;
		while (i <= 10) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("=%d\n", sum);
		*/
		
		// 2)
		/*
		int i=0, sum=0;
		while (i < 10) {
			i++;
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d\n", sum);
		*/
		
		// 3)
		int i=0, sum=0;
		while (++i <= 10) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d\n", sum);
		
	}
}
