package days02;


/**
 * @author sangmun
 * @date 2023. 7. 14. - 오후 4:13:09
 * @subject
 * @content
 */
public class Ex15_02 {
	public static void main(String[] args) {
		int i = 10;
		
		// 10 -> "10" 형변환
		String si = i + "";
		si = String.valueOf(i);
		
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toString(i, 2));
		
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toString(i, 8));
		
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toString(i, 16));
	}
}
