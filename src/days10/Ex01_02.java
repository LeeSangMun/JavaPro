package days10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오전 10:26:17
 * @subject	9일차 복습 (2)
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) {
		int n = 125;
		int share, reminder;

		char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		String s = "";
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			s = ch[reminder] + s;
			n = share;
		} // while

		System.out.printf("0x%s", s);
	}
}
