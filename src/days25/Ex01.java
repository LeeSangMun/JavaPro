package days25;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 5:27:07
 * @subject	24일차 복습
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days24\\1. Java 팀 구성.txt";

		ArrayList<MemberVO> teamList = null;
		HashMap<TeamVO, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();
		String line = null;

		String teamName = null;
		int teamTotalNumber = 0;
		String teamLeaderName = null;

		TeamVO teamVO = null;
		MemberVO memberVO = null;

		try (FileReader reader = new FileReader(fileName); BufferedReader br = new BufferedReader(reader)) {

			while ((line = br.readLine()) != null && !line.equals("")) {
				teamName = line;
				line = br.readLine();
				String[] tNames = line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				for (String tName : tNames) {
					if (tName.contains("(팀장)")) {
						teamLeaderName = tName = tName.replace("(팀장)", "");
						memberVO = new MemberVO(tName, "팀장");
					} else {
						memberVO = new MemberVO(tName, "팀원");
					}
					teamList.add(memberVO); // value
				} // foreach
				teamTotalNumber = teamList.size();
				teamVO = new TeamVO(teamName, teamTotalNumber, teamLeaderName);
				teamMap.put(teamVO, teamList);

			} // while

			// 만약에 key가 중복이 된다면 X 팀명이 같으면
			// key가 중복이 된다고 처리해야 된다.

			teamVO = new TeamVO("1조", 1, "홍길동");
			if (!teamMap.containsKey(teamVO)) {
				teamList = null;
				teamMap.put(teamVO, teamList);
			} else {
				System.out.println(">> 1조는 teamMap에 사용 중이다.");
			} // if

			// 출력
			dispTeamMember(teamMap);
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	} // main

	private static void dispTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {

		Set<Entry<TeamVO, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir = eset.iterator();

		ArrayList<MemberVO> teamList = null;
		TeamVO teamVO = null;

		while (ir.hasNext()) {
			Entry<TeamVO, ArrayList<MemberVO>> entry = ir.next();

			teamVO = entry.getKey();
			teamList = entry.getValue();

			System.out.printf("%s\n", teamVO); // toString() 재정의.

			/*
			if (teamList != null) {
				Iterator<MemberVO> ir2 = teamList.iterator();
				int seq = 1;

				if (ir2.hasNext())
					ir2.next();
				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
					System.out.printf("  [%d] %s\n", seq++, memberVO.getName());
				} // while
			} else {
				System.out.println("  팀원이 존재하지 않습니다.");
			} // if
			*/

			try {
				Iterator<MemberVO> ir2 = teamList.iterator();
				int seq = 1;

				if (ir2.hasNext())
					ir2.next();
				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
					System.out.printf("  [%d] %s\n", seq++, memberVO.getName());
				} // while
			} catch (NullPointerException e) {
				System.out.println("  팀원이 존재하지 않습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			} // catch

		} // while

	}

} // class

