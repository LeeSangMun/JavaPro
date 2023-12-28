package days25;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오전 10:52:09
 * @subject
 * @content
 */
public class Ex03 {

	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400, "▲");

		private final int value;
		private final String symbol;
		
		Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;
		}
		
		public int getValue() {
			return value;
		}
		
		public String getSymbol() {
			return symbol;
		}
		
		// 추상 메서드 선언 가능
//		abstract int test(int i);
	}
	
	public static void main(String[] args) {
		// [열거형에 멤버 추가]
		
		// [열거형 구조 이해]
		/*
		 * 1. 컴파일러가 클래스로 변환
		 * 		class Dircetion extends Enum {
		 * 			static final Dircetion EAST = new Direction("EAST");
		 * 			static final Dircetion SOUTH = new Direction("SOUTH");
		 * 			static final Dircetion WEST = new Direction("WEST");
		 * 			static final Dircetion NORTH = new Direction("NORTH");
		 * 
		 * 			private String name;
		 * 			private int ordinal;
		 * 			private Direction(String name) {
		 * 				this.name = name;
		 * 			}
		 * 
		 * 			pulbic int ordinal() {
		 * 				return this.ordinal;
		 * 			}
		 * 
		 * 			public String name() {
		 * 				return this.name;
		 * 			}
		 * 		}
		 */
		
		// 열거형 ordinal() 메서드에 의해서 열거형 상수를 사용하는데
		// 상수값은 0,1,2,3 순서를 반환
		// 내가 원하는 정수값을 설정해서 사용할 수 있다.
		Direction[] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(dir.name() + "/" + dir.ordinal() + "/" + dir.getSymbol() + "/" + dir.getValue());
		}
	}

}
