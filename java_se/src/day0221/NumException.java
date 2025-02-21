package day0221;

@SuppressWarnings("serial")
public class NumException extends Exception {
	
	public NumException() {
		System.out.println("구구단은 2~9단 까지 입니다.");
	}
	public NumException(int num) {
		super();
	}

}//class
