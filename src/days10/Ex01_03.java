package days10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오전 10:26:22
 * @subject	9일차 복습 (3)
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
		int n = 125;
		int share, reminder;

		/*
		String hex = "0123456789ABCDEF";
		String s = "";
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;

			s = hex.charAt(reminder) + s;
			n = share;
		} // while
		*/
		
		String hex = "0123456789ABCDEF";
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			sb.append(hex.charAt(reminder));
			n = share;
		} // while

		System.out.printf("0x%s", sb.reverse());
	}
}
