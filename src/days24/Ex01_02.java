package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오전 10:37:32
 * @subject	23일차 복습
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
	      
	      String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
	      
	      // [ 자바 IO(Input Output) ]
	      // FileReader, BufferedReader(보조스트림)
	      // FileWriter, BufferedWriter
	      ArrayList<MemberVO> teamList = null;
	      HashMap<String, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>(); 
//	      HashMap<String, ArrayList<MemberVO>> teamMap = new HashMap<>(); 
	      String line = null;
	      String teamName = null; // key
	      MemberVO memberVO =  null;
	      
	       try (FileReader reader = new FileReader(fileName);BufferedReader br = new BufferedReader(reader)){
	          
	          while ( ( line = br.readLine() ) != null && !line.equals("")) {
	             teamName = line; // key
	             
	             line = br.readLine() ; // 이경서(팀장), 신종혁, 이재영, 송해영, 신기범, 이준희, 김성준
	             String [] tNames = line.split("\\s*,\\s*");
	             teamList = new ArrayList<MemberVO>();
	             for (String tName : tNames) { 
	               if( tName.contains("(팀장)")) {
	                  tName = tName.replace("(팀장)",""); 
	                  memberVO = new MemberVO(tName, "팀장");   
	               }else {
	                  memberVO = new MemberVO(tName, "팀원");   
	               }
	               teamList.add(memberVO); // value
	            } // foreach             
	             
	             teamMap.put(teamName, teamList) ;
	             
	         } // while    
	          
	          dispTeamMember(teamMap);
	      } catch (Exception e) { 
	         e.printStackTrace();
	      } // catch
	      
	      
	   } // main

	private static void dispTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> ir = eset.iterator();
		
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		int teamCount = 0;
		String teamLeader = null;
		
		while (ir.hasNext()) {
			Entry<String, ArrayList<MemberVO>> entry = ir.next();
			teamName = entry.getKey();
			teamList = entry.getValue();
			teamCount = teamList.size();
			teamLeader = teamList.get(0).getName();
			System.out.printf("[%s(%d):%s]\n", teamName, teamCount, teamLeader);
			Iterator<MemberVO> ir2 = teamList.iterator();
			int seq = 1;
			if(ir2.hasNext()) ir2.next();
			while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf("  [%d]%s\n", seq++, memberVO.getName());
			}
		}
	}


}
