package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 4:32:28
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) throws IOException {
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author sangmun\r\n"
				+ " * @date 2023. 8. 17. - 오전 10:52:09\r\n"
				+ " * @subject\r\n"
				+ " * @content\r\n"
				+ " */\r\n"
				+ "public class Ex03 {\r\n"
				+ "\r\n"
				+ "	enum Direction {\r\n"
				+ "		EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400, \"▲\");\r\n"
				+ "\r\n"
				+ "		private final int value;\r\n"
				+ "		private final String symbol;\r\n"
				+ "		\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return value;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return symbol;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		// 추상 메서드 선언 가능\r\n"
				+ "//		abstract int test(int i);\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		// [열거형에 멤버 추가]\r\n"
				+ "		\r\n"
				+ "		// [열거형 구조 이해]\r\n"
				+ "		/*\r\n"
				+ "		 * 1. 컴파일러가 클래스로 변환\r\n"
				+ "		 * 		class Dircetion extends Enum {\r\n"
				+ "		 * 			static final Dircetion EAST = new Direction(\"EAST\");\r\n"
				+ "		 * 			static final Dircetion SOUTH = new Direction(\"SOUTH\");\r\n"
				+ "		 * 			static final Dircetion WEST = new Direction(\"WEST\");\r\n"
				+ "		 * 			static final Dircetion NORTH = new Direction(\"NORTH\");\r\n"
				+ "		 * \r\n"
				+ "		 * 			private String name;\r\n"
				+ "		 * 			private int ordinal;\r\n"
				+ "		 * 			private Direction(String name) {\r\n"
				+ "		 * 				this.name = name;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * \r\n"
				+ "		 * 			pulbic int ordinal() {\r\n"
				+ "		 * 				return this.ordinal;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * \r\n"
				+ "		 * 			public String name() {\r\n"
				+ "		 * 				return this.name;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * 		}\r\n"
				+ "		 */\r\n"
				+ "		\r\n"
				+ "		// 열거형 ordinal() 메서드에 의해서 열거형 상수를 사용하는데\r\n"
				+ "		// 상수값은 0,1,2,3 순서를 반환\r\n"
				+ "		// 내가 원하는 정수값을 설정해서 사용할 수 있다.\r\n"
				+ "		Direction[] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(dir.name() + \"/\" + dir.ordinal() + \"/\" + dir.getSymbol() + \"/\" + dir.getValue());\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "}";
		
		// [문제]	source문자열에서 [15번째 라인의] 문자열을 line15 변수에 저장한 후 출력하는 코딩
		
		// [1]
		/*
		String line21 = source.split("\r\n")[20];
		System.out.println(line21);
		*/
		
		// [2]
		
		StringReader sr = new StringReader(source);
		BufferedReader br = new BufferedReader(sr);
//		br.skip(20); // 문자 skip
		int i=1;
		while(i++<=14) br.readLine();
		String line14 = br.readLine();
		System.out.println(line14);
		
		
		
		// [3]
		/*
		String line21 = Stream.of(source.split("\r\n")).skip(20).findFirst().get();
		*/
		
		String line15 = Stream.of(source.split("\r\n")).skip(14).findFirst().get();
		System.out.println(line15);
		
	}

}
