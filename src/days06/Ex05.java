package days06;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 12:06:50
 * @subject	제어문 활용
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		int n;
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 정수(n) 입력 ? ");
//			n = sc.nextInt();
			String inputData = sc.nextLine();
			char[] datas = inputData.toCharArray();
			boolean flag = false;
			for (int i = 0; i < datas.length; i++) {
				if(!('0' <= datas[i] && datas[i] <= '9')) {
					flag = true;
					break;
				}
			} // for
			
			if(!flag) {
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
