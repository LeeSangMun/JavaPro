package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 4:41:06
 * @subject	[직렬화]	객체를 스트림으로 만드는 것
 * @content	[역직렬화]	스트림을 객체로 만드는 것
 * 					ObjectInputStream / ObjectOutputStream
 * 					직렬화가 가능한 클래스로 만들기 위해서 단지
 * 					Serializable를 구현하면 된다.
 */
public class Ex07 {

	public static void main(String[] args) {
		UserInfo u1 = new UserInfo("김호중", "1234", 25);
		UserInfo u2 = new UserInfo("이지현", "4321", 23);
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		
		String pathname = ".\\src\\days26\\UserInfo.ser";
		try(FileOutputStream out = new FileOutputStream(pathname);
				ObjectOutputStream oos = new ObjectOutputStream(out)) {
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			
			System.out.println("> u1, u2, list 객체를 직렬화 시켜서 oos파일로 저장완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// The serializable class UserInfo does not declare a static final serialVersionUID field of type long
class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6501921011789709671L;
	String name;
	// transient 덧없는 무상한
	transient String password; // 직렬화 대상에 제외
	int age;
	
	public UserInfo() {
		this("UnKnown", "1111", 0);
	}

	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}