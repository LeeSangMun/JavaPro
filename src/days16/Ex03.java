package days16;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오전 10:46:12
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. 지역변수 -> 상수(fianl 키워드)
		final double PI = 3.141592;
		
		FinalTest obj = new FinalTest();
		System.out.println(obj.PI);
		
		// The final field FinalTest.PI cannot be assigned
//		obj.PI = 3.14;
	}

}

class Parent {
	// 재정의 할 수 없는 최종 메서드
	final void dispA() {
		
	}
}

class Child extends Parent {
	// Cannot override the final method from Parent
//	 @Override
//	 void dispA() {
//			
//	}
 }

class FinalTest {
//	public static final double PI = 3.141592;
	
	// The blank final field PI may not have been initialized
	final double PI;
	
	// 인스턴스 초기화 블럭
	/*
	{
		PI = 3.141592;
	}
	*/
	
	// 생성자 초기화
	public FinalTest() {
		PI = 3.141592;
	}
	
	// 
	public void finalTest(final int value) {
		
	}
}