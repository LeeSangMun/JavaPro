package days10;

import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 4:31:34
 * @subject	랜덤 이름
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		System.out.printf("%d\t%d\n", (int)'가', (int)'힣');
		
		Random rnd = new Random();
		char one = (char)(rnd.nextInt('힣'-'가'+1) + '가');
		System.out.println(one);
	}
}
