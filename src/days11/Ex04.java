package days11;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 12:06:37
 * @subject 숫자 빈도 구하기
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		// int[] m // size는 30
		// 0~9 임의의 정수
		// 각 숫자 빈도 구하기

		int[] m = new int[30];
		int[] d = new int[10];

		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(m));

		for (int i = 0; i < m.length; i++) {
			d[m[i]]++;
		}

		for (int i = 0; i < d.length; i++) {
			System.out.printf("%d - %d개\n", i, d[i]);
		}
	}
}
