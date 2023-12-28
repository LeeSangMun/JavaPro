package days06;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오전 11:16:41
 * @subject	복습문제 4) 풀이
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		
		// 추가로 소문자이면 다음 행에 다시 출력되게 만들자
		// 엔터키를 치면 두줄씩 나오게 (아직 못품)
		for(int i='A', count=1, lineNumber = 1; i <= 'z'; i++) {
			if(i > 'Z' && i < 'a') {
				
				continue;
			}
			
			if(count % 10 == 1) {
				System.out.print(lineNumber++ + " : ");
			}
			
			System.out.printf("%1$c(%1$03d)", i);
			if(count++ % 10 == 0) {
				System.out.println();
			}
			
			if(i == 'Z') {
				System.out.println();
				count = 1;
			}
		}
	}
}
