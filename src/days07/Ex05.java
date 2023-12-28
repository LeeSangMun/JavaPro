package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 11:29:56
 * @subject	정규표현식
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		// 1. 주민등록번호 000000-0000000
		/*
		String rrn = "123456-1234567";
		String regex = "[0-9]{6}-\\d{7}";
		
		// 반복횟수 ?(0,1) +(1, 여러개) *(0,여러개)
		// {n}  {n, m} {n, }
		if(rrn.matches(regex)) {
			System.out.println("올바른 주민등록번호 형식");
		} else {
			System.out.println("잘못된 주민등록번호 형식");
		}
		*/
		
		// 2. 우편번호 000-000 , 00000
		/*
		String zipCode = "123-456";
		String zipCode2 = "12345";
		String zipCode3 = "123456";
		String zipCode4 = "123-a56";
		String zipCode5 = "123-3456";
		*/
		
		String[] zipCode = {"123-456", "12345", "123456", "123-a56", "123-3456"};
		String regex = "\\d{3}-\\d{3}|\\d{5}";
		boolean flag = false;
		
		for (int i = 0; i < zipCode.length; i++) {
			flag = zipCode[i].matches(regex);
			System.out.printf("%s - %s 우편번호\n", zipCode[i], flag ? "올바른" : "잘못된");
		} // for
	}
}
