package days02;

public class Ex12 {
	public static void main(String[] args) {
		//문자형 char
		//[진법변환]
		
		char c = 'A';
		// ASCII 7비트(128문자)
		// 확장 ASCII (8비트 256문자)
		// 인코딩 'A' -> 65
		// 디코딩 65 -> 'A'
		
		// '\u0000' ~ '\uffff'
		
		// 16진수 
		char d = '\u0061';
		
		System.out.printf("d:%c%n", d);
		
		//대문자 - 소문자 = 65 - 97 = -32
	}
}
