package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 12:20:59
 * @subject
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		// 1~n까지 합 재귀 함수
		int n = 10;
		int result = recursiveSum(n);
		System.out.printf("1~%d=%d\n", n, result);
	}
	
	public static int recursiveSum(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n + recursiveSum(n-1);
		}
	}
}
