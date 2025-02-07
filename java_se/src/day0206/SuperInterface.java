package day0206;

/**
 * 구현클래스가 구현해야하는 업무들의 목록만 제공.<br>
 * 인터페이스 -> 네가 해야할 일 목록<br>
 * 냉장고에 붙여 둔 포스트잇 위에 같이 있는 10000원!<br>
 */
public interface SuperInterface {
	
//	int i; //인스터스 변수를 선언할 수 없다.
	
//	public SuperInterface() { //생성자를 만들 수 없다 = 인터페이스는 직접 객체화 할 수 없다.
//		
//	}
	
//	public void test() { //일반 메소드를 가질 수 없다. 오직 추상메소드만 가질 수 있다.
//		//클래스가 가지는 일반적인 것들을 가질 수 없다. 
//		//일반 method도 가질 수 없다. => 직접 업무를 구현할 수 없다.
//	}
	
	public static final int MAX=10000;
	
	
	//interface는 abstract 접근지정자를 기술하지 않아도 abstract method가 구현된다.
	public void methodA();//body없는 메소드
	public abstract String methodB();
	
	public default void methodC() {
		System.out.println("인터페이스에서 구현하여 제공하는 기능");
	}
	

}
