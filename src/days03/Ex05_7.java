package days03;


/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 3:04:25
 * @subject	전위형, 후위형 증감연산자 설명
 * @content
 */
public class Ex05_7 {
	public static void main(String[] args) {
		int x = 10;
//		int y = ++x; // 전위형 > x=11, y=11
		int y = x++;	// 후위형 > x=11, y=10
		
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
}
