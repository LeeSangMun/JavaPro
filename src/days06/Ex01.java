package days06;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오전 8:44:01
 * @subject	복습 문제
 * @content
 */
public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 1)
		/*
		int a,b,c;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 정수 3개 입력 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			int max  = Math.max(a, Math.max(b, c));
			int min = Math.min(a, Math.min(b, c));
			
			System.out.println("가장 큰수=" + max + "\t가장 작은수=" + min);
			
			
		} catch(Exception e) {
			
		}
		*/
		
		// 2)
		/*
		int[] m = new int[10];
		for(int i=0; i<m.length; i++) {
			m[i] = (int)(Math.random()*11) + 5;
		}
		System.out.println("m = " + Arrays.toString(m));
		*/
		
		
		// 4)
		/*
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if(i % 10 == 4) {
				System.out.println();
			}
		} // for
		
		for(int i='a'; i <= 'z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		*/
		
		// 5)
		/*
		int x , y, sum = 0;
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 두 정수 입력 ? ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			int min = Math.min(x, y);
			int max = Math.max(x, y);
			
			if(min % 2 != 0) {
				min++;
			}
			
			for(int i=min; i<=max; i+=2) {
				System.out.printf("%d+", i);
				sum += i;
			}
			
			System.out.printf("=%d\n", sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 6)
		/*
		try(Scanner sc = new Scanner(System.in)) {
			System.out.printf("> 나의 이름 입력 ? ");
			String name = sc.nextLine();
			char[] nameArr = name.toCharArray();
			
			for (char c : nameArr) {
				System.out.print(c);
			}
		} catch(Exception e) {
			
		}
		*/
		
	}
}
