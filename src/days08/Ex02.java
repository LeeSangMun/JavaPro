package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오전 10:18:46
 * @subject	7일차복습 (2)
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(new int[] {1,2}));
		
		char one = 'x';
		char upperOne = myUpperCase(one);
		System.out.println(upperOne);
	}

	public static char myUpperCase(char one) {
//		char upperCaseOne = one;
		
		if(Character.isLowerCase(one)) {
//			upperCaseOne = Character.toUpperCase(one);
			one = Character.toUpperCase(one);
		}
		
		return one;
	}

	public static int sum(int... args) {
		int result = 0;
		/*
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		} // for
		*/
		
		for(int i : args) {
			result += i;
		}
		return result;
	}
}
