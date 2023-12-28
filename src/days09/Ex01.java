package days09;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오전 8:49:53
 * @subject	8일차 복습
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		int money = 125760;
		int unit = 50000;
		boolean sw = false;	
		int count = 0;				// 갯수
		
		while (unit >= 1) {
			count = money / unit;
			System.out.printf("%d원 : %d개\n", unit, count);
			money %= unit;
			unit /= sw ? 2 : 5;
			sw = !sw;
		}
	}
	
	/*
	public static String toBinaryString(int n) {
		String s = "";
		while(n != 0) {
			s = n%2 + s;
			n /= 2;
		}
		return String.format("%032d", Integer.parseInt(s));
	}
	*/
} 
