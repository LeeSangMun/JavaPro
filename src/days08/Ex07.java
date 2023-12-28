package days08;

public class Ex07 {
	public static void main(String[] args) {
		// 재귀 함수
		// 1) 1~n 합 재귀함수
		// 2) 팩토리얼(factorial)
		// 		정의) 1에서 양의 정수의 곱
		
		// 일반함수
		/*
		int result = factorial(5);
		System.out.println(result);
		*/
		
		// 재귀함수
		int result = recursiveFactorial(5);
		System.out.println(result);
	}

	public static int recursiveFactorial(int n) {
		if(n > 1) {
			return n * recursiveFactorial(n-1);
		} else if(n==1 || n==0) {
			return 1;
		} else {
			return -1;
		}
	}

	public static int factorial(int n) {
		if(n < 0) {
			return -1;
		}
		
		int result = 1;
		for(int i=n; i >= 1; i--) {
			result = result * i;
		}
		
		return result;
	}
}
