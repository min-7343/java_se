package day0206;

/**
 * 상속관계에서 부모클래스를 정의할 때 사용되는 추상클래스<br>
 * 접근지정자로 abstract 와 final은 동시에 사용할 수 없다.<br>
 */
public abstract class AbstractSuper {
	private int i;

	
	public AbstractSuper() {
		System.out.println("추상클래스의 기본 생성자");
	}//AbstractSuper
	
	public void printI() {
		System.out.println("인스턴스 변수 i : "+i);
	}//printI
	
	/**
	 * 정수값을 반환하는 일
	 * @return 반환할 정수 값
	 */
	public abstract int getI() ;
	/**
	 * 메시지를 입력받아 출력하는 일
	 * @param msg 출력할 메시지
	 */
	public abstract void printMsg(String msg);
	
	
//	public static void main(String[] args) {
		//추상클래스는 직접 객체화 할 수 없다.
		
//		AbstractSuper as= new AbstractSuper();//error		
//	}
	
}
