package days20;

import java.text.MessageFormat;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 3:16:19
 * @subject	MessageFormat
 * @content	특정형식 <- 데이터(값) 출력
 * 							  -> 데이터(값) 읽기
 */
public class Ex10 {

	public static void main(String[] args) {
		String name = "이준희";
		int age = 20;
		boolean gender = true;
		
		// [1]
		/*
		String output = String.format("이름:%s, 나이:%d살, 성별:%s", name, age, gender);
		System.out.println(output);
		*/
		
		// [2] MessageFormat
		
		// 이름:이준희, 나이:20살, 성별:true
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		String output = MessageFormat.format(pattern, name, age, gender);
		System.out.println(output);
	}

}
