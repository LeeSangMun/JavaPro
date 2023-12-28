package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오후 4:40:32
 * @subject	[고의로 예외 발생시키기]
 * @content	1. new 예외클래스()
 * 					2. throw 문을 사용해서 예외를 발생시킬 수 있다.
 */
public class Ex15 {

	public static void main(String[] args) {
		// [checked 예외] -> 예외처리를 해야함
		// Unhandled exception type IOException
//		System.in.read();
		
		// [unchecked 예외]
		int kor = getScore();
		System.out.println(kor);
		
		/*
		try {
			int kor = getScore();
			System.out.println(kor);
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

	public static int getScore() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("> 국어 점수 입력 ? ");
		String input = sc.next();
		String regex = "100|[1-9]?\\d";
		
		if(input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			throw new InputMismatchException("점수 범위(0~100) 벗어남.");
		}
	}

}
