package days06;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 12:25:15
 * @subject
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		int n;
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 정수(n) 입력 ? ");
//			n = sc.nextInt();
			String inputData = sc.nextLine();
			
			// 정규 표현식
			String regex = "^[0-9]+$";
			// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
//			String regex = "^\\d+$"; // 위 코드와 동일
			boolean flag = inputData.matches(regex);
			
			if(flag) {
				n = Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				System.out.println("입력 잘못 !!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
