package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 4:54:44
 * @subject
 * @content
 */
public class Ex10_02 {
	public static void main(String[] args) {
		String rrn = "830412-1700001";
		
		String[] rrnArr = rrn.split("-");
		
		// 830412-1******
		System.out.printf("%s-%c******\n", rrnArr[0], rrn.charAt(7));
		System.out.printf("%s-%c******\n", rrnArr[0], rrnArr[1].charAt(0));
		
		System.out.println(rrn.substring(0, 8) + "******");
		
		// 830412-*******
		System.out.printf("%s-*******\n", rrnArr[0]);
	}
}
