package days16;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 4. - 오후 4:10:31
 * @subject
 * @content
 */
public class Ex15_02 {

	public static void main(String[] args) {
		// [checked 예외] -> 예외처리를 해야함
		// Unhandled exception type IOException
//		System.in.read();
		
		// [unchecked 예외]	RuntimeException
		// [checked 예외]		Exception
//		int kor = getScore();
//		System.out.println(kor);
		
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

	public static int getScore() throws IOException {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("> 국어 점수 입력 ? ");
		String input = sc.next();
		String regex = "100|[1-9]?\\d";
		
		if(input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			throw new IOException("점수 범위(0~100) 벗어남.");
		}
	}

}
