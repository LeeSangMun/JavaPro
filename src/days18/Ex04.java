package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오전 11:25:36
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [Ojbect.hashCode() 메서드]
		// 해시 -> 해시함수(해싱기법)
		//	  ㄴ 데이터 관리 기법 중의 하나
		//	  ㄴ 		: 저장, 검색 등등
		//	  ㄴ 객체 저장 -> 주소값 -> 해시코드 변환 -> 반환하는 메서드
		// [참고] 동일한 객체 체크 =equals() + hashCode() 오버라이딩
		
		// String s1 = "홍길동";
		// String s2 = "홍길동";
		
		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
