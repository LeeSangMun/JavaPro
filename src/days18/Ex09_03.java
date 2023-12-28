package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 4:53:51
 * @subject
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {
//		testString();			// > String 			처리 시간 : 3765099900ns
		testStringBuffer();	// > StringBuffer	처리 시간 : 4510100ns
	}
	
	// String
	private static void testString() {
		long start = System.nanoTime();
		
		String s = "a";
		for (int i = 0; i <200000; i++) {
			s += "a";
		} // forr
		
		long end = System.nanoTime();
		System.out.printf("> String 처리 시간 : %dns\n", end-start);
	}
	
	// StringBuffer
	private static void testStringBuffer() {
		long start = System.nanoTime();
		
		StringBuilder sb = new StringBuilder("a");
		for (int i = 0; i <200000; i++) {
			sb.append("a");
		} // forr
		
		long end = System.nanoTime();
		System.out.printf("> StringBuffer 처리 시간 : %dns\n", end-start);
	}
}
