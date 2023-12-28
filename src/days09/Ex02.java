package days09;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오전 10:11:15
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		int n = 10;
		// 1) 
		/*
		
		System.out.println(s.substring(b.length()));
		*/
		
		// 2)
		/*
		String b = Integer.toBinaryString(n);
		System.out.println(b);
		
		System.out.printf("%032d\n", Integer.parseInt(b));
		*/
		
		// 3)
		int share, reminder;
		String  s = "";
		
		int[] binaryArr = new int[32];
		int index = binaryArr.length - 1;
		
		while(n != 0) {
			share = n / 2;
			reminder = n % 2;
			System.out.println(reminder);
			binaryArr[index--] = reminder;
			s += reminder;
			n = share;
		}
		
		System.out.println(Arrays.toString(binaryArr).replace(", ", ""));
		
		/*
		String s = "";
		while(n != 0) {
			s = n%2 + s;
			n /= 2;
		}
//		String.format("%032d", Integer.parseInt(s));
		System.out.printf("%032d", Integer.parseInt(s));
		*/
	}
}
