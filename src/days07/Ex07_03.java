package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 2:28:51
 * @subject
 * @content
 */
public class Ex07_03 {
	public static void main(String[] args) {
		// 피보나치 수열
		int num1=1, num2=1, num3=0, sum = num1 + num2;
		
		System.out.printf("%d+%d+", num1, num2);
		/* [A]
		while(num1+num2 <= 100) {
			num3 = num1 + num2;
//			if(num3 > 100) break;
			num1 = num2;
			num2 = num3;
			sum += num3;
			System.out.printf("%d+", num3);
		}
		*/
		
		// [b]
		while((num3 = num1+num2) <= 100) {
//			num3 = num1 + num2;
//			if(num3 > 100) break;
			num1 = num2;
			num2 = num3;
			sum += num3;
			System.out.printf("%d+", num3);
		}
		
		System.out.printf("=%d", sum);
	}
}
