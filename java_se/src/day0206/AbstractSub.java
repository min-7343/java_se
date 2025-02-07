package day0206;

/**
 * AbstractSuper를 상속받는 자식 클래스.
 */

public class AbstractSub extends AbstractSuper {
	@Override
	public int getI() {
		
		return 2025;
	}

	@Override
	public void printMsg(String msg) {
		
		System.out.println(msg);
//		printMsg(msg);  //무한으로 부르게 된다.
//		super.printMsg(msg); //애초에 불러지지 않게 했다. 몸 없음
		//추상 method는 super로 호출할 수 없다. error
	}
	
	@Override
	public String toString() {
		return "안녕 : " +super.toString() + " /"+ hashCode();
	//일반 method는 super로 호출할 수 있다.
	}
	
	
	public static void main(String[] args) {
		
		//추상클래스는 상속관계의 자식클래스가 생성될 때에만 생성된다.
		AbstractSub as= new AbstractSub();
		System.out.println(as.getI());
		as.printMsg("맛점하셨습니까?");
		
		//is a 관계의 객체화를 하여 getI, pintMsg()호출
		
		AbstractSuper as2= new AbstractSub();
		System.out.println(as2.getI());
		as2.printMsg("우아아");
		
		System.out.println("----------------------------------------------");
		System.out.println("System.out.println()에 as객체를 넣었을때 \"안녕\"메시지와 뒤에객체의 주소를 출력하고 싶다.");
		//Object.toString Method가 불렸다.
		
		//@Override를 하면 된다. -> println의 출력을 바꾸는 것
		System.out.println(as);
		
	}// main

}// class
