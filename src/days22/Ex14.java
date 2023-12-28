package days22;

import java.util.HashSet;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 4:23:17
 * @subject	HashSet
 * @content
 */
public class Ex14 {

	public static void main(String[] args) {
		// (참고) Set + 순서 유서 유지 -> LikedHashSet
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		// [1, 9, 10, 15] 저장 순서 유지 x
		System.out.println(hs);
		
		hs.add(1);
		System.out.println(hs);
		System.out.println(hs.size());
		
	}

}
