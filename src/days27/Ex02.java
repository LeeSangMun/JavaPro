package days27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sangmun
 * @date 2023. 8. 21. - 오전 9:18:27
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 대충 만든 자판
		System.out.println(Arrays.toString(Solution.solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD","AABB"})));
		System.out.println(Arrays.toString(Solution.solution(new String[] {"AA"}, new String[] {"B"})));
		System.out.println(Arrays.toString(Solution.solution(new String[] {"AGZ", "BSSS"}, new String[] {"ASA","BGZ"})));
		System.out.println(Arrays.toString(Solution.solution(new String[] {"AB", "BA"}, new String[] {"AA"})));
		System.out.println(Arrays.toString(Solution.solution(new String[] {"BC", "CDB"}, new String[] {"BB"})));
		System.out.println(Arrays.toString(Solution.solution(new String[] {"BC"}, new String[] {"AC", "BC"})));
		
		// 햄버거
		//System.out.println(Solution.solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
		
		
	}

}

class Solution {
	
	
	// 햄버거
	public static int solution(int[] ingredient) {
		int answer = 0;
		String str = "";
		for (int i = 0; i < ingredient.length; i++) {
			str += ingredient[i];
		} // for

		while(str.contains("1231")) {
			answer++;
			str = str.replaceFirst("1231", "");
		}

		return answer;
	}
	
	// 대충 만든 자판
	public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        char ch = ' ';
        
        for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				ch = keymap[i].charAt(j);
				if(map.containsKey(ch) && map.get(ch) > j+1) {
					map.put(ch, j+1);
					continue;
				} else if(!map.containsKey(ch)) {
					map.put(ch, j+1);
				}
			} // for
		} // for
       
        for (int i = 0; i < targets.length; i++) {
			for (int j = 0; j < targets[i].length(); j++) {
				if(map.get(targets[i].charAt(j)) == null) {
					answer[i] = -1;
					break;
				}
				answer[i] += map.getOrDefault(targets[i].charAt(j), 0);
			} // for
		} // for
		
        
        return answer;
    }
}