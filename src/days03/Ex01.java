package days03;

import java.util.Scanner;


/**
 * @author sangmun
 * @date 2023. 7. 17. - 오전 9:49:44
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		String name = "이상문";
		System.out.printf("%s\n", name);
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name);
		System.out.printf("[%-10s]\n", name);
		
		int n = 50;
		System.out.printf("%d\n", n);
		System.out.printf("%#o\n", n);
		System.out.printf("%#x\n", n);
		
		double pi = 3.141592;
		System.out.printf("%f\n", pi);
		System.out.printf("%.3f\n", pi);
		System.out.printf("[%10.3f]\n", pi);
		
		int no = 1;
		System.out.printf("%d\n", no);	
		System.out.printf("%4d\n", no);
		System.out.printf("%04d\n", no);
		
		System.out.printf("%d(%c)\n", 65, 65);
		//Format specifier '%c'
//		System.out.printf("%d(%c)\n", 65);
		System.out.printf("%1$d(%1$c)\n", 65);
	}
}
