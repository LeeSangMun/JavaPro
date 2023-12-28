package days19;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 2:46:32
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 정규표현식
		// - 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		// - 미리 정의된 기호
		// - 자바 정규표현식과 관련 클래스 2개 있음
		// 1) Pattern 클래스
		// 2) Matcher 클래스
		
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
//		String regex = "c.*";
//		String regex = "c[a-zA-Z]*";
//		String regex = "c[a-z]";	// c + 소문자 1개
//		String regex = "c\\w";		// c[a-zA-Z0-9]
//		String regex = ".*";		
//		String regex = "c.*t"; 		// c로 시작 t로 끝나는 문자열들		
//		String regex = "c\\d"; 		// c로 + 숫자 1개
//		String regex = "c\\D"; 		// c로 + 숫자가 아닌것들 1개 c[^0-9]
//		\\s 공백	\\S !공백
//		String regex = "(b|c).*"; 		// 
//		String regex = "[bc].{2}"; 		// 
//		String regex = "[b-d].{2,3}"; 		// 
//		String regex = "[b-d].+"; 		// 1개 이상
//		String regex = "[b-d].?"; 		// 1개 또는 0개
//		String regex = "[b-d].*"; 		// 0개 이상
		String regex = "[a-zA-Z&&[^b-d]].*"; 		
		
		Pattern p = Pattern.compile(regex);
		Matcher m;
		for (int i = 0; i < data.length; i++) {
			m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.println(data[i] + " ");
			}
		} // for
	}

}
