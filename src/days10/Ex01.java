package days10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오전 10:25:13
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		int n = 125;
		int share, reminder;

		// 0 1 2 3 4 5
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s = "";
		char one;
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			if (reminder >= 10)
				one = ch[reminder - 10];
			else
				one = (char) (reminder + '0'); // 7 -> '7'
			s = one + s;
			n = share;
		} // while

		System.out.printf("0x%s", s);
		
		// 2번 문제 내가 한 거
		/*
		try (Scanner sc = new Scanner(System.in)){
			char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
			
			System.out.print("> 10진수 정수를 입력하세요 ? ");
			int n = sc.nextInt();
			int x = n;
			String s = "";
			while(x != 0) {
				s =  (x%16 >= 10) ? ch[x%16-10] + "" : x%16+ s;
				x /= 16;
			}
			System.out.printf("10진수 %d -> 16진수 %s", n, "0x" + s);
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}
}
