package days11;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 3:11:02
 * @subject	다차원 배열
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		/*
		 * 다차원 배열은 배열의 배열이다.
		 */
		
		// 1) 1~3학년 1~10반 각 반마다 30명
		// 국어점수를 저장
//		int[] kors = new int[3*10*30];
		// 2학년 4반 15번 -> 국어점수 입력 : 90
		
		// 3차원 배열 선언
		int[][][] kors = new int[3][10][30];
		kors[1][3][14] = 90;
	}
}
