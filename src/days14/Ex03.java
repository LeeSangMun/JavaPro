package days14;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오전 10:41:10
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		Random rnd = new Random(10000L);
		
		Scanner sc = new Scanner(System.in);
		
		int year = 2023 - 1900;
		int month = 10-1;
		int day = 25;
		Date d = new Date(year, month, day);
		System.out.println(d);
		System.out.println(d.getDay());
	}
}
