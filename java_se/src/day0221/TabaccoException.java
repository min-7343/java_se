package day0221;

/**
 * 업무명  + Exception으로 클래스명을 설정<br>
 * 기본생성자 : 예외발생시 고정적인 메시지를 설정할 때.
 * Overloading 생성자 : 예외발생시 사용자가 설정한 메시지를 출 할 때.
 */
@SuppressWarnings("serial")
public class TabaccoException extends Exception {

	public TabaccoException() {
		this("지나친 흡연은 건강에 해롭습니다");
	}//TabaccoException
	
	public TabaccoException(String msg) {
		//여기서 생성자 불러도 된다.
		super( msg );
	}//TabaccoException
	
	
	
}//class
