package days19;

import java.util.StringTokenizer;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오전 11:40:47
 * @subject	StringTokenizer 클래스
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		String str = "고경림,김성준,김정주,김호영";
		
//		String[] str.split(regex);
		
		StringTokenizer st = new StringTokenizer(str, ",");
//		System.out.println(st.countTokens());
		
		/*
		int countToken = st.countTokens();
		for (int i = 0; i < countToken; i++) {
			System.out.println(st.nextToken()); // 읽어온 다음에 토큰을 버림 그래서 countTokens의 갯수는 변함
		} // for
		*/
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
