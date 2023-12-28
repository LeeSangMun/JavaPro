package days02;


/**
 * @author sangmun
 * @date 2023. 7. 14. - 오후 3:30:02
 * @subject
 * @content
 */
public class Ex14 {
	public static void main(String[] args) {
		// 9.1234567 2진수 변환
		// 1001.0001111...
		// 1.XXX * 2^n 정규화
		// 1.001000... * 2^3
		
		// Type mismatch: cannot convert from double to float
		float pi = 3.14f;
//		float pi = (float) 3.14;
//		double pi = 3.14;
		
		System.out.printf("pi = %f", pi);
	}
}
