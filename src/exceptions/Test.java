package exceptions;

public class Test extends RuntimeException {
	private int min;
	private int max;

	public Test(String message, int min, int max) {
		super(message);
		this.min = min;
		this.max = max;
	}

}