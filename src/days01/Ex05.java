package days01;

public class Ex05 {
	public static void main(String[] args) {
		// 1) + -> 덧셈연산자
		System.out.println(3+5);
		
		// 2) + -> 문자열연결연산자
		String name = "이상문";
		System.out.println("이름 : " + name);
		
		// 3) + -> 문자열연결연산자
		// "문자열" + 정수
		// 정수 + "문자열"
		int age = 26;
		System.out.println("나이 : " + age);
		
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
		System.out.println("이름은 " +  "\"" + name + "\"" + "이고,\n 나이는 '" + age + "'입니다.");
	
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'입니다.", name, age);
	}
}
