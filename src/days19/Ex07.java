package days19;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 12:22:54
 * @subject	오토박싱과 오토언박싱
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		int i = 100;
		Integer j = i; // 기본형 -> 객체 오토박싱
		
		// JDK 1.5이전
//		Integer k = new Integer(i);
		
		int k = j; // 객체 -> 기본형 오토언박싱
		
		test(i);
		test(j);
	}

	/*
	private static void test(int i) {
		System.out.println(i);
	}
	 */
	
	private static void test(Object i) {
		System.out.println(i);
	}
}
