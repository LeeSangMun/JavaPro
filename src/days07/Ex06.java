package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 12:12:11
 * @subject	
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		// 1+2+...+10=55
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			int n = i%2==0 ? -i : i;
			System.out.printf("%d +", n);
//			System.out.printf(i%2==0 ? "%d+" : "%d-", i);
			sum += n;
		}
		System.out.printf("\b=%d", sum);
	}
}
