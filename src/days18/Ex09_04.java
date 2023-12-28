package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 5:14:00
 * @subject
 * @content
 */
public class Ex09_04 {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	
	public static String solution(int n) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < n/2; i++) {
			sb.append("수박");
		} // for
		
		if(n%2 == 1) {
			sb.append("수");
		}
		
		return sb.toString();
	}

}
