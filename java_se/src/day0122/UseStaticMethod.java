package day0122;

/**
 * static method : 객체화 하지 않ㄱ 클래스명으로 직접 호출할 수 있는 method<br>
 * 객체가 가지고 있는 값을 사용하지 않고. parameter로 입력되는 값이나 static변수에 입력된 값으로
 * 업무를 구형해야할 때 사용함.
 *  
 */
public class UseStaticMethod {
	
	public static int dayOfMonth =22;
	/**
	 * 콘솔에 메시지를 출력하는 일.
	 * 1)메소드의 선언
	 */
	public static void printMessage(){
		System.out.println("안녕하세요? 오늘은 "+dayOfMonth+"일 입니다. o(^^O)(O^^)o");
	}
	
	public static void main(String[] args) {
		//2) 호출
		printMessage(); // 같은 클래스(영역)의 메소드 호출=>메소드명
		UseStaticMethod.printMessage();//어떤 클래스(영역).메소드명
		System.out.println("\n========================");
		
	
		
	

	}//main

}//class
