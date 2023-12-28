package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 12:45:51
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 문자열 다루는 클래스
		// String StringBuffer StringBuilder StringTokenizer
		
		// String : 변경 불가능한 클래스
		String name = "홍길동";
		name += "님";
		
		System.out.println(name);
		
		// 1.
		/*
		System.out.println(name.length());
		*/
		
		// 2.
		/*
		for (int i = 0; i < name.length(); i++) {
			System.out.printf("name[%d]='%c'\n", i, name.charAt(i));
		} // for
		*/
		
		String rrn = "890223-1700001";
		// 3.
		/*
		System.out.println(rrn.substring(rrn.length()-1));
		System.out.println(rrn.substring(0, 2));
		*/
		
		// 4.
		/*
		String regex = "\\d{6}-\\d{7}";
		System.out.println(rrn.matches(regex));
		*/
		
		// 5. concat()
		/*
		String a = "ㅁㅁㅁ" + "ㅠㅠㅠ" + "ㅌㅌㅌ";
		String b = "ㅁㅁㅁ".concat("ㅠㅠㅠ").concat("xxx");
		*/
		
		// 6.
		// Stream rrn.chars();
		
		// 7. 
		/*
		// 0 - 동일한 문자열, 
		System.out.println("kenik".compareTo("kEnik"));
		System.out.println("kenik".compareToIgnoreCase("kEnik"));
		*/
		
		// 8. 
		/*
		System.out.println("kenik".equals("kEnik"));
		System.out.println("kenik".equalsIgnoreCase("kEnik"));
		*/
		
		// 9.
		/*
		System.out.println("안녕하세요. 홍길동입니다.".contains("김길동"));
		*/
		
		// 10.
		String url = "http://www.naver.com/test.jsp";
		String suffix = ".jsp"; // 접미사
		String prefix = "http://"; // 접두사
		System.out.println(url.startsWith(prefix));
		System.out.println(url.endsWith(suffix));
		
		// 11.
//		rrn.
	}

}
