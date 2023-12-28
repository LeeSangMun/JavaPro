package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 4:46:54
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(!(1 <= a.length() && a.length() <= 20) || a.length() == 0) {
        	return;
        } else if(!a.matches(".*[a-zA-Z].*")) {
        	return;
        }
        
        char[] cArr = new char[a.length()];
        
        for(int i=0; i<a.length(); i++) {
        	char ch = a.charAt(i);
        	
        	if('a' <= ch && ch <= 'z') {
        		cArr[i] = (char)(ch - 32);
        	} else {
        		cArr[i] = (char)(ch + 32);
        	}
        }
        System.out.println(cArr);
	}
}
