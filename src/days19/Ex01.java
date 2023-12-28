package days19;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오전 8:53:19
 * @subject	18일차 복습
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String line = "박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민";
		String regex = "\\s*,\\s*";
		String[] teamMembers = line.split(regex);
		String teamLeader = null;
		String[] teamMember2 = new String[teamMembers.length-1];
		for (int i = 0, index = 0; i < teamMembers.length; i++) {
			if(teamMembers[i].contains("(팀장)")) {
				teamLeader = teamMembers[i].replace("(팀장)", "");
//				break;
				continue;
			}
			teamMember2[index++] = teamMembers[i];
		} // for
		
		// Arrays.sort(teamMember2, Collections.reverseOrder());
		 Arrays.sort(teamMember2, (n1, n2) -> n2.compareTo(n1));
		
		 /*
		 String output = "<ul>";
		 output += String.format("\r\n\t<li class=\"leader\">%s</li>", teamLeader);
		 output += "\r\n\t<li>" + String.join("</li>\r\n\t<li>", teamMember2) + "</li>";
		 output += "\r\n</ul>";
		 System.out.println(output);
		 */
		 
		 StringBuilder sb = new StringBuilder();
		 sb.append("<ul>");
		 sb.append(String.format("\r\n\t<li class=\"leader\">%s</li>", teamLeader));
		 sb.append("\r\n\t<li>" + String.join("</li>\r\n\t<li>", teamMember2) + "</li>");
		 sb.append("\r\n</ul>");
		 System.out.println(sb.toString());
	}
	
}
