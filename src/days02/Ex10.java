package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		byte age;
		
		System.out.print("나이를 입력 하세요 > ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Type mismatch: cannot convert from String to byte
//		age = br.readLine();
		 age = Byte.parseByte(br.readLine());
		 
		 System.out.println("> 나이는 " + age + "살 입니다.");
	}
}
