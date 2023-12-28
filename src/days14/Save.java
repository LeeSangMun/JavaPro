package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 2:13:54
 * @subject
 * @content
 */
//저축과 관련된 클래스
public class Save {
	private String name;	// 예금주
	private int money;		// 예금액
	
	// 1. 인스턴스가 생성될 때 마다 필드가 생성되지 않는다.
	// 2. 클래스 선언될 때 Method area에 필드가 생성된다.
	// 		(객체를 생성하지 않아도 static 필드는 벌써 생성되어 있다.)
	// 3. 모든 인스턴스(객체)가 공유하는 필드된다.
	// 공유변수(필드), shared 변수, static 변수, 정적변수, 클래스 변수
	private static double rate = 0.04;	// 이자율
	
	public Save() {}
	// Alt + Shift + S

	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public static double getRate() {
		return rate;
	}
	
//	public double getRate() {
//		return rate;
//	}

//	public  void setRate(double rate) {
//		// Cannot use this in a static context
//		this.rate = rate;
//	}
	
	public static void setRate(double rate) {
		// Cannot use this in a static context
		// The assignment to variable rate has no effect
		Save.rate = rate;
	}
	
	public void dispSvae() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n", 
				this.name, this.money, this.rate);
	}
}
