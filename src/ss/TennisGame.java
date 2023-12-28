package ss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ss.TennisScoreCounter;

public class TennisGame {

	public static void main(String[] args) {
		String[] players = { "박정호", "이동현", "이상문", "이주영", "정하영", "주강민" };

		int gameFormat, gameMode;
		TennisScoreCounter tsc;

		ArrayList<Player> player = new ArrayList<>();
		Player A = new Player();
		Player B = new Player();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print(">단식(1)/복식(2)입력");
			gameFormat = scanner.nextInt(); // 예외처리 해야함
			for (int i = 0; i < players.length; i++) {
				System.out.printf("%d. %s\n", i + 1, players[i]);
			}
			if (gameFormat == 1) {
				System.out.println(">1팀 선수 입력");
				A.name = players[scanner.nextInt()];
				System.out.println(">2팀 선수 입력");
				B.name = players[scanner.nextInt()];
			} else {
				System.out.println(">1팀 선수 2명 입력");
				A.name = players[scanner.nextInt()] + "," + players[scanner.nextInt()];
				System.out.println(">2팀 선수 2명 입력");
				B.name = players[scanner.nextInt()] + "," + players[scanner.nextInt()];
			}
			System.out.println(A.name + "vs" + B.name);

			System.out.println(">세트 수 입력 3 or 5");
			gameMode = scanner.nextInt(); // 예외처리 해야함
			tsc = new TennisScoreCounter(gameFormat, gameMode);
			scanner.close();

			HashMap<Player, TennisScoreCounter> tennisGame = new HashMap<>();
			tennisGame.put(A, tsc);
			tennisGame.put(B, tsc);

			int atPoint = tennisGame.get(A).gettPoint();
			int btPoint = tennisGame.get(B).gettPoint();

			System.out.println(tennisGame.get(A).gettPoint());
			int p = -1;
			while (atPoint != 4 || btPoint != 4) {
				p = (int) (Math.random() * 2 + 1);
				if (p == 1) {
//					return tennisGame.get(A).gettPoint();
				} else {
//					return tennisGame.get(B).gettPoint();
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class Player {
	String name;
}

class TennisScoreCounter {

	private int tPoint, tGame, tSet;
	private int gameFormat; // 단식 1 복식 2
	private int gameMode; // 세트 수 3 or 5

	public TennisScoreCounter() {
		super();
	}

	public TennisScoreCounter(int gameFormat, int gameMode) {
		super();
		this.gameFormat = gameFormat;
		this.gameMode = gameMode;
	}

	public int gettPoint() {
		return tPoint;
	}

	public void settPoint(int tPoint) {
		this.tPoint = tPoint;
	}

	public int gettGame() {
		return tGame;
	}

	public void settGame(int tGame) {
		this.tGame = tGame;
	}

	public int gettSet() {
		return tSet;
	}

	public void settSet(int tSet) {
		this.tSet = tSet;
	}

	public void pointWinner(int p) {
	}

	public void gameWinner(int Winner) {

	}

	public void dispScoreBoard() {
	}

}