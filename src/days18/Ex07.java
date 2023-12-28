package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 12:26:59
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [객체로 부터 Class 객체를 얻어오는 3가지 방법]
		// 1) Object의 getClass() 사용
		/*
		Card card1 = new Card("HEART", 3);
		Class cls = card1.getClass();
		System.out.println(cls.getName());
		*/
		
		// 2) 모든 클래스명.class 클래스 변수 제공
		/*
		Class cls = Card.class;
		System.out.println(cls);
		try {
			Card card2 = (Card)cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		// 3) Class 클래스의 static 메서드 - forName();
		try {
			String className = "days18.Card";
			Class cls = Class.forName(className);
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

final class Card {
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
	
}