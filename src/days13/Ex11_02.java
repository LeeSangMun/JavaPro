package days13;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

import days10.Ex06_04;

public class Ex11_02 {
	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT 	 = 3;
		
		Student[][] students = new Student[CLASS_COUNT][STUDENT_COUNT];
	
		char con = 'y';
		int[] counts = new int[CLASS_COUNT];
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		int ban;
		int no = 1;
		
		do {
			System.out.print("> 반 입력 ? ");
			ban = sc.nextInt();
			System.out.printf("> %d반의 [%d]번 학생의 이름 국어 영어 수학 입력 ? ",
					ban, counts[ban-1] + 1);
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			wrank = rank = 1;
			
			Student s = students[ban-1][counts[ban-1]] = new Student();
			
			
			s.no = counts[ban-1] + 1;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.rank = rank;
			s.wrank = wrank;
			s.avg = avg;
			
			counts[ban-1]++;
			
			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while(Character.toUpperCase(con) == 'Y');
	
		procRank(students, counts);
		
		int countSum = IntStream.of(counts).sum();
		System.out.printf("\t\t학생 정보 출력(%d명)\n", countSum);
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				students[i][j].printStudentInfo2();
			} // for
		} // for
	}

	private static void procRank(Student[][] students, int[] counts) {
		Student s1, s2;
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				s1 = students[i][j];
				s1.rank = 1;
				s1.wrank = 1;

				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						s2 = students[i2][j2];
						if (s1.tot < s2.tot) {
							s1.wrank++;
							if (i == i2) {
								s1.rank++;
							}
						}
					} // for
				} // for
			} // for
		} // for
	}
}
