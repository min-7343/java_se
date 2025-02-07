package day0122;

/**
 *instance method사용<br>
 *instance variable, static variable, local variable을 사용하여 업무를 처리할 때 정의.<br>
 */
public class UseInstanceMethod {
	
	int dayOfMonth; //instance variable;
	/**
	 * 인스턴스 변수를 사용하여 콘솔에 일자를 출력하는 일.
	 */
	public void printDay() {
		System.out.println(dayOfMonth+ "일");
	}//printDay
	
	public static void main(String[] args) {
//		printDay();//- static영역에서는 non static영역 (여기선 instance영역)의 자원을 직접 사용할 수 없다.
		
		//2. 객체화  클래스명 객체명 = new 클래스명();
		UseInstanceMethod uim =new UseInstanceMethod();
		//인스턴스 변수가 초기화된다.
		//3)호출
		uim.printDay(); //0일 출력
		uim.dayOfMonth=22;
		uim.printDay();
		//instance variable은 객체가 살아있는 동안 값이 유지된다.
		uim.dayOfMonth++;//22->23
		uim.dayOfMonth++;//23->24
		uim.printDay();//24일 출력		
		
		//인스터스 변수는 객체마다 같은 이름의 변수가 생성되고 사용된다. ( 객체마다 따로 생성)
		UseInstanceMethod uim2 = new UseInstanceMethod();
		uim2.dayOfMonth=31;
	
		uim2.printDay(); //31일
		uim.printDay(); //24일
		
	}//main

}//class
