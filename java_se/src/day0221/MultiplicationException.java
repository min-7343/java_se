package day0221;

@SuppressWarnings("serial")
public class MultiplicationException extends Exception {
	
	public MultiplicationException() {
		super("구구단 2~ 9단 까지 입니다.");
	}
	
	public MultiplicationException(String msg) {
		super(msg);
	}
	

}
