package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오전 11:44:58
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		String name;
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("> 이름 입력 ? ");
			//name = sc.next();
			name = sc.nextLine();
			
			// 1)
			/*
			char[] nameArr = new char[name.length()];
			for(int i=0; i<nameArr.length; i++) {
				nameArr[i] = name.charAt(i);
			}
			*/
			
			// String -> char[] 변환
			char[] nameArr = name.toCharArray();
			
			// char[] -> String 변환
			name = String.valueOf(nameArr);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
