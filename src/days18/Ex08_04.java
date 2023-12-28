package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 3:45:53
 * @subject
 * @content
 */
public class Ex08_04 {

	public static void main(String[] args) {
//		String s = "안녕하세요. 홍길동입니다. 홍길동이고, 홍길동입니다.";
		String s = "안녕하세요. 홍길동입니다. 홍길도이고, 홍길둥입니다. 홍길.입니다.";
		// "홍길동" -> "hong.gildong"
//		s = s.replaceFirst("홍길동", "hong.gildong");
//		s = s.replaceAll("홍길[가-힣]", "hong.gildong");
		
//		s = s.replace('홍', '강');
		s = s.replace("홍길도", "XYZ");
		
		// 업캐스팅
		CharSequence target = "홍길동";
		System.out.println(s);
	}

}
