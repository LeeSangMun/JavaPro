package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오후 3:35:32
 * @subject
 * @content
 */


public class Student {
	// 필드
	public int no;
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public double avg;
	public int rank;
	public int wrank;
	
	
	// 메서드
	public void printStudentInfo() {
		System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d등\n", no, name, kor, eng, mat, tot,
				avg, rank);
	}
	
	public void printStudentInfo2() {
		System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d등\t%d등\n", no, name, kor, eng, mat, tot,
				avg, rank, wrank);
	}
}
