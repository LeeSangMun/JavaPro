package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 5:34:50
 * @subject	화폐 단위 나누기(2)
 * @content
 */
public class Ex11_02 {
	public static void main(String[] args) {
		// 화폐 단위 나누기
		int[] moneys = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String[] sunit = {"5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원"};
		int[] moneyCnt = new int[moneys.length];
		int money = 125760;	
		
		//화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		for(int i=0; i<moneys.length; i++) {
			moneyCnt[i] = money/moneys[i];
			money %= moneys[i];
			if(money == 0) {
				break;
			}
		}
		
		for (int i = 0; i < moneys.length; i++) {
			System.out.printf("%s - %d개\n", sunit[i], moneyCnt[i]);
		} // for
	}
}
