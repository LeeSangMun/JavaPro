package days04;

public class Ex06 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print((i != 10) ? i+"+" : i + "");

			sum += i;
		}

		System.out.printf("=%d" , sum);
	}
}
