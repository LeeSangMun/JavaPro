package days16;

public class ScoreOutOfBoundException extends RuntimeException {
	private final int ERROR_CODE;
	
	public ScoreOutOfBoundException(String message) {
		this(1000, message);
	}
	
	public ScoreOutOfBoundException(int ERROR_CODE, String message) {
		super(message);
		this.ERROR_CODE = ERROR_CODE;
	}

	public int getERROR_CODE() {
		return ERROR_CODE;
	}

}
