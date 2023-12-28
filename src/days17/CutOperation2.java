package days17;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CutOperation2 {
	public static void main(String[] args) throws IOException {
		// 입력
		/*
		6
		5 4 4 2 2 8
		*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sticks = new int[n];
		int sticksLength = sticks.length;
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = sc.nextInt();
		} // for
		
		Arrays.sort(sticks);
		System.out.println(Arrays.toString(sticks));
		
		int index = 0;
		int sticksCount = sticksLength - index;
		System.out.println(sticksCount);
		
		for (int i = 0; i < sticksLength; i++) {
			if(sticks[index] != sticks[i]) {
				index = i;
				sticksCount = sticksLength - i;
				System.out.println(sticksCount);
			}
		} // for
	}
}
