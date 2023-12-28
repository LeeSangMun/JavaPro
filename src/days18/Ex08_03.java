package days18;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 3:05:15
 * @subject
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		String s = "안녕하세요. 입니다. 입니다. 입니다.";
		String name = "홍길동";
		/*
//		int index = s.indexOf('녕');
		int index = s.indexOf("입니다.");
		s = s.substring(0, index) + name + s.substring(index);
		System.out.println(s);
		*/
		
		// 문제
		// 마지막 "입니다." 찾아서 그 앞에 "홍길동"
		/*
		int index = s.lastIndexOf("입니다.");
		s = s.substring(0, index) + name + s.substring(index);
		System.out.println(s);
		*/
		
		// 두번째 "입니다. "
		/*
		int index = s.indexOf("입니다.");
		index = s.indexOf("입니다.", index+1);
		s = s.substring(0, index) + name + s.substring(index);
		System.out.println(s);
		*/
		
		/*
		String[] sArr = s.split("입니다.");
		System.out.println(Arrays.toString(sArr));
		*/
		
		/*
		int fromIndex = 0;
		int index = s.indexOf("입니다");
		System.out.println(index);
		fromIndex = index + "입니다.".length();
		index = s.indexOf("입니다", fromIndex);
		*/
		
		int fromIndex = 0;
		int index = -1;
		while((index = s.indexOf("입니다", fromIndex)) != -1) {
			System.out.println(index);
			fromIndex = index + "입니다.".length();
		}
		
		/*
		int index = 0;
		int count = 0;
		while(( index = s.indexOf("입니다.", index)) != -1) {
			count ++;
			if(count == 2) {
				s = s.substring(0, index) + name + s.substring(index);
				System.out.println(s);
				break;
			}
			index++;
		}
		*/
		
		"abc".toUpperCase();	// "ABC"
		"ABC".toLowerCase();	// "abc"
		
		// String[] "홍길동,김길동,이길동".split(regex);
		String[] nameArr = "홍길동,김길동,이길동,박길동".split(",", 2);
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		} // for
	}
	
	/*
	public static int indexOf(String target, String sw, int no) {
		
	}
	*/
}
