package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 12:15:43
 * @subject	재귀함수(recursive function)
 * @content	재귀 -> 순환, 되풀이하는, 재귀하는
 * 					함수 안에서 자기 자신을 호출하는 함수
 */
public class Ex06 {
	public static void main(String[] args) {
		disp();
	}

	// 재귀 함수
	public static void disp() {
		System.out.println("> disp() 호출됨...");
		disp();
	}
}
