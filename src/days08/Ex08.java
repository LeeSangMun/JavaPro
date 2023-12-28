package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 2:13:18
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		// 2^3 = 8
		// 거듭제곱
		
		// 일반 함수
//		double result = pow(2, -3);
		double result = recursivePow(2, -3);
		System.out.println(result);
		// 재귀 함수
	}
	
	public static double recursivePow(int n, int m) {
		/*
		if(m > 0) {
			if(m == 1) {
				return n;
			} else {
				return n * recursivePow(n, m-1);
			}
		} else if(m < 0){
			if(m == -1) {
				return 1/(double)n;
			} else {
				return 1/(double)n * recursivePow(n, m+1);
			}
		} else {
			return 1;
		}	
		*/
		
		if(m > 1) return n * recursivePow(n, m-1);
		else if(m == 1) return n;
		else if(m == 0) return 1; 
		else return 1/(recursivePow(n, -1*m));
		
	}

	public static double pow(int n, int m) {
		double result = 1;
		
		for(int i=0; i<Math.abs(m); i++) {
			result *= n;
		}
		
		return m > 0 ? result : 1/result;
	}
}
