package days02;


/**
 * @author sangmun
 * @date 2023. 7. 14. - 오후 2:27:47
 * @subject	String -> byte, short, int, long 변환하는 방법
 * @content
 */
public class Ex10_02 {
	public static void main(String[] args) {
		String n = "10";
		
		int i = Integer.parseInt(n);
		long l = Long.parseLong(n);
		short s = Short.parseShort(n);
		byte b = Byte.parseByte(n);
	}
}
