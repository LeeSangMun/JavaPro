package days17;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CutOperation {
	public static void main(String[] args) throws IOException {
		// 입력
		/*
		6
		5 4 4 2 2 8
		*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sticks = new int[n];
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = sc.nextInt();
		} // for
		
		System.out.println(Arrays.toString(sticks));
		int stickMin = sticks[0];
		for (int i = 0; i < sticks.length; i++) {
			if(stickMin > sticks[i]) {
				stickMin = sticks[i];
			}
		} // for
		System.out.println(stickMin);
		
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] -= stickMin;
		} // for
		
		System.out.println(Arrays.toString(sticks));
		
		
//		cutOperation(6, new int[] {5,4,4,2,2,8});
//		cutOperation(8, new int[] {1,2,3,4,3,3,2,1});
	}
	
	/*
	public static void cutOperation(int n, int[] nArr) {
		List<Integer> al = new ArrayList<>();
		
		for(int i=0; i<nArr.length; i++) {
			al.add(nArr[i]);
		}
		
		while(al.size() != 0) {
			System.out.println(al.size());
			Collections.sort(al);
			int first = al.get(0);
			
			for(int i=al.size()-1; i>=0; i--) {
				al.set(i, al.get(i)-first);
				if(al.get(i) == 0) {
					al.remove(i);
				}
			}
		}	
	}
	*/
}
