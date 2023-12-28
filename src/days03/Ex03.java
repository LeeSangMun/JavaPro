package days03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 나이 국어 영어 수학 입력 > ");
		String name = sc.next();
		int age = sc.nextInt();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.printf("\"%s\" %d살 %d %d %d %d %.2f", name, age, kor, eng, math, sum, avg);
	}
}
