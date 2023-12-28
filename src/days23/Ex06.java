package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 3:13:02
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [Map 인터페이스]
		 * 1. key + value 한 쌍으로 관리
		 * 2. Entry = (key, value)
		 * 3. key 중복 x
		 * 		value 중복 o
		 * 4.	HashMap (신)
		 * 		HashTable (구)
		 * 5. HashMap을 사용하도록 권장
		 * 6. 해싱(Hashing) ? 
		 * 		- 해시함수를 이용해서 데이터를 해시테이블에 저장하고 검색하는 기법
		 * 		- 해시함수 ? 데이터가 저장되어 있는 곳을 알려주는 함수
		 * 		   데이터를 빠르게 찾을 수 있다.
		 * 		- 데이터저장(key+value)	키를 해시 함수에 넣으면 
		 * 		  배열의 한 요소를 얻어오고
		 * 		  다시 그 곳에 연결된 링크드 리스트에 데이터를 저장
		 */

//		HashMap<String, String> hm = new HashMap<>();
		Hashtable<String, String> hm = new Hashtable<>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		System.out.println(hm);
		hm.put("hong", "홍중복"); // 키가 중복될 때 새로운 value로 저장
		System.out.println(hm);
		hm.put("root", "관리자");
		System.out.println(hm);
		System.out.println("-".repeat(50));
		
		// 모든 key 조회
		Set<String> kSet = hm.keySet();
		Iterator<String> ir = kSet.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
//			System.out.println(key);
		}
//		System.out.println("-".repeat(50));
		
//		hm.containsKey("hong")
//		hm.containsValue("홍중복");
//		String value = hm.get("root");
//		String value = hm.getOrDefault("kim", "익명");
		hm.replace("root", "관리자", "루트");
		
		// 모든 value 조회
		Collection<String> vSet = hm.values();
		Iterator<String> ir2 = vSet.iterator();
		while (ir2.hasNext()) {
			String value = ir2.next();
//			System.out.println(value);
		}
//		System.out.println("-".repeat(50));
		
		// root 키를 알 때 value 조회?
		String key = "admin";
		String value = hm.get(key);
//		System.out.println(value);
		
		dispHm(hm);
	}

	// [1]
	/*
	private static void dispHm(HashMap<String, String> hm) {
		// key : value
		Set<String> kSet = hm.keySet();
		Iterator<String> ir = kSet.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			String value = hm.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
	}
	*/
	
	// [2]
//	private static void dispHm(HashMap<String, String> hm) {
	private static void dispHm(Hashtable<String, String> hm) {
		// key : value
		Set<Entry<String, String>> eset = hm.entrySet();
		Iterator<Entry<String, String>> ir = eset.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s : %s\n", key, value);
		}
	}
}
