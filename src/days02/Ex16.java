package days02;


/**
 * @author sangmun
 * @date 2023. 7. 14. - 오후 4:28:01
 * @subject	형변환
 * @content
 */
public class Ex16 {
	public static void main(String[] args) {
		// 1. 자동 형변환 - 2가지
		int i = 10;
		long l = i;
		float f = l;
		System.out.println(f);
		
		long L = l + i;
		
		// 2. 강제 형변환
		// 3*(5 + 2) -> () 최우선연산자
		// (변환하고자 하는 타입) cast 연산자
		int a = 20;
		int b = 3;
		System.out.println(a / b);
		System.out.println((double)a / b);
	}
}
