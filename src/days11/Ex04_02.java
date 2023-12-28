package days11;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 12:15:43
 * @subject 숫자 빈도 구하기
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		int[] m = new int[30];
		int[] counts = new int[10];
		
		for (int i = 0; i < m.length; i++) {
			m[i] = getRandomInt(0, 9);
			counts[m[i]]++;
		}
	}
	
	public static int getRandomInt(int min, int max) {
		return (int)(Math.random()*(Math.abs(max-min)+1)) + Math.min(max, min);
	}
}
