package days20;

import java.text.DecimalFormat;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 2:09:09
 * @subject	형식화 클래스(4가지)
 * 					Decimal, SimpleDate, Choice, Message
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// Decimal
//		int money =3257600;
		double money =3257600.8;
		
		// [1]
		/*
		String strMoney = String.format("\\%,d", money);
		System.out.println(strMoney);
		*/
		
		// [2 ]DecimalFormat
		// 패턴에 사용할 수 있는 기호
		// 0 10진수	값이 없을 경우 0을 출력
		// # 10진수
		// - 음수 부호
		// , 단위 구분자
		// E 지수기호
		// ; 패턴구분자
		// % 퍼센트
		// ' escape문자
		// \u00A4 통화기호
		
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(money));
	}

}
