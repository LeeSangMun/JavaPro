package days08;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 4:37:01
 * @subject
 * @content
 */
public class Ex10 {
	public static void main(String[] args) {
		String card = "7655-8988-9234-5677";
		String regex = "-";
		String[] cardArr = card.split(regex);
		
		int index = (int)(Math.random()*cardArr.length);
		cardArr[index] = "****";
		
		/*
		String printCard = String.format("%s-%s-%s-%s", 
				cardArr[0], cardArr[1], cardArr[2], cardArr[3]);
		System.out.println(printCard);
		*/
		
		String printCard = String.join(regex, cardArr);
		System.out.println(printCard);
		
		// 내가 한 거
		/*
		String card = "7655-8988-9234-5677";
		
		String[] cards = card.split("-");
		cards[(int)(Math.random()*cards.length)] = "****";
		
		System.out.println(	String.join("-", cards));
		*/
	}
}
