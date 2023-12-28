package days03;


/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 4:40:57
 * @subject	인덱스 연산자([])
 * @content	
 */
public class Ex11 {
	public static void main(String[] args) {
		// 1. 국어점수를 저장할 변수를 선언.
		// int kor;
		
		// 2. 국어점수를 5만명 저정할 변수를 선언.
		
		
		/*
		 * 1. 배열 정의 ? 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것
		 * 2. 배열 선언 형식
		 * 		자료형[] 배열이름 = new 자료형[배열크기];
		 * 		
		 * 
		 */
		
		int[] kors = new int[5];
		
		System.out.println(kors.length);
		System.out.println(kors.length - 1); // 윗첨자값하고 같다.
		
		kors[0] = 90;
		kors[1] = 100;
		kors[2] = 80;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
	}
}
