package days16;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오후 12:24:48
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
	}

}

interface Movable {
	void move(int x, int y); // public abstract
}

interface Attackable {
	void attack(Unit unit);
}

// 인터페이스끼리 상속이 가능하고 다중 상속도 가능
interface Fightable extends Attackable, Movable {
	
}

abstract class Unit {
	int currentHP; // 현재 유닛의 체력
	int x; // 유닛의 위치(x좌표)
	int y; // 유닛의 위치(y좌표)
}

class AirUnit extends Unit {
	
}

class GroundUnit extends Unit {
	
}

class Fighter implements Fightable {

	@Override
	public void attack(Unit unit) {
		
	}

	@Override
	public void move(int x, int y) {
		
	}
	
}

interface Repairable {
	
}

class Tank extends GroundUnit implements Fightable, Repairable {

	@Override
	public void attack(Unit unit) {
		
	}

	@Override
	public void move(int x, int y) {
		
	}
	
}

class SCV extends GroundUnit implements Repairable {
	SCV() {}
	
	void repair(Repairable unit) {
		if(unit instanceof Tank) {
			
		} else if(unit instanceof SCV) {
			
		} else if(unit instanceof DropShip) {
			
		}
	}
}

class DropShip extends AirUnit implements Fightable, Repairable {

	@Override
	public void attack(Unit unit) {
		
	}

	@Override
	public void move(int x, int y) {
		
	}
	
}