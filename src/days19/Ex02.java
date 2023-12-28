package days19;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오전 11:00:45
 * @subject	18일차 복습문제
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
//		String my_str = "abcdef123";
//		int n = 3;
		
		String[] answer = Solution.solution(my_str, n);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution {
    public static String[] solution(String my_str, int n) {
    	int answerLength = (int)Math.ceil((double)my_str.length()/n);
        String[] answer = new String[answerLength];
        
        int beginIndex = 0, endIndex;
        String str = null;
        int my_strLength = my_str.length();
        int index = 0;
        while(index != answerLength) {
        	endIndex = beginIndex + n;
        	if(endIndex > my_strLength) endIndex = my_strLength;
        	str = my_str.substring(beginIndex, endIndex);
        	beginIndex = endIndex;
        	answer[index++] = str;
        }
        
        return answer;
    }
}