package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 3:49:41
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// days20.Ex01.java 파일 읽어서
		// HashMap 저장 - key + value
		String fileName = ".\\src\\days20\\Ex01.java";
		int code = -1;
		char one = '\u0000';
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		try(FileReader fr = new FileReader(fileName)) {
			
			while ((code = fr.read()) != -1) {
				one = (char)code;
				// System.out.print(one);
				if(Character.isLowerCase(one) || Character.isUpperCase(one)) {
					/*
					if(hmap.containsKey(one)) {
						hmap.put(one, hmap.get(one)+1);
					} else {
						hmap.put(one, 1);
					}
					*/
					hmap.put(one, hmap.getOrDefault(one, 0) + 1);
				}
			}
			
			Set<Entry<Character, Integer>>  eSet = hmap.entrySet();
			Iterator<Entry<Character, Integer>> ir = eSet.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry = ir.next();
				System.out.printf("'%c'(%d) %s\n", entry.getKey(), entry.getValue(),
						"#".repeat(entry.getValue()));
			}
			
			System.out.println(hmap);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
