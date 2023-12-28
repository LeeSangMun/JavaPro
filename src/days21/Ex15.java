package days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오후 4:41:30
 * @subject
 * @content
 */
public class Ex15 {

	public static void main(String[] args) throws IOException {
		// 한 반에 30명 학생 이,국,영,수,총,평,등
		// [Student클래스 + ArrayList 처리]
		
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;
		int wrank;
		
		final int STUDENT_COUNT = 30;
		ArrayList list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		char con = 'y'; // 입력 여부
		int no = 0;
		
		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
//			name = sc.next();
			name = getName();			
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = 1;
			wrank = 1;

			Student s = new Student(++no, name, kor, eng, mat, tot, avg, rank, wrank);
			list.add(s);
			
			System.out.print("> 학생 입력 계속 ?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		// [문제]
		// 1. 등수 처리
		// 2. 성적순으로 오름차순 정렬
		
		Student s1 ,s2;
		for (int i = 0; i < list.size(); i++) {
			s1 = (Student)list.get(i);
			for (int j = 0; j < list.size(); j++) {
				s2 = (Student)list.get(j);
				if(s1.getTot() < s2.getTot()) {
					s1.setRank(s1.getRank() + 1);
				}
			} // for
		} // for
		
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getRank() - o2.getRank();
			}
		});
		
		// 모든 학생 출력
		System.out.println("> 입력받은 학생수 : " + list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
	}

	public static String getName() {
		Random rnd = new Random();
		char[] nameArr = new char[3];
		for(int i=0; i<nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1) + '가');
		}
		
		return new String(nameArr);
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}
}
