package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오전 11:09:28
 * @subject
 * @content
 */
public class Person {
	private String name;
	private int age;
	private boolean gender;
	
	// Alt + Shift + S
	
	public Person(boolean b) {
		gender = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(0 <= age && age <= 130) {
			this.age = age;
		} else {
			throw new RuntimeException("Person.age 0~100 실행오류!!!");
		}
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
