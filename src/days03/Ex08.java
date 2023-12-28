package days03;


/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 3:26:17
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		//Type mismatch: cannot convert from double to float
		float pi = 3.141592f;
		
		//소수점 4번째자리에서 반오림한 실수값을 얻어와서
		//출력 3.142	
		// [1]
		pi = Float.parseFloat(String.format("%.3\nf", pi)) ;
		
		// [2]
		System.out.println((int)(pi * 1000 + 0.5) / 1000f);
	}
}
