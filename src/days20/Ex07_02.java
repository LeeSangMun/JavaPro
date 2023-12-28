package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 2:21:27
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		String strMoney = "1,234,567";
		
		DecimalFormat df = new DecimalFormat();
		try {
			int money = df.parse(strMoney).intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
