package day0206;

/**
 * interface를 구현하는 클래스(인터페이스안에 추상메소드는 구현의 강제성이 있다.)
 */
public class InterfaceImp1 implements SuperInterface{

	
	
	@Override
	public void methodA() {
		System.out.println("구현클래스에서 Override한 method");
	}

	@Override
	public String methodB() {
		
		return "눈오는 목요일";
	}
	
	public void methodD() {
		System.out.println("클래스의 일반 method.");
	}

	public static void main(String[] args) {
		
		//인터페이스는 직접 객체화 할 수 없다.
//		SuperInterface si=new SuperInterface();
		
		//객체화 하지 않고 쓸 수 있다.
		System.out.println(SuperInterface.MAX);
		
		//구현 클래스를 생성하여 heap의 주소는 저장할 수 있다. => is a 관계의 객체화
		//인터페이스를 구현한 주소를 si에 저장 할 수 있다.
		//InterfaceImp1의 
		SuperInterface si=new InterfaceImp1();
		
		//객체명으로 호출할 수 있는 것은
		//1.상수 2.Override한 method  3. default method
		
		si.methodA();
		System.out.println(si.methodB());
		//default method
		si.methodC(); //D라고 써있다.
		
		
		//구현 클래스가 가진 method는 is a 관계의 객체화에는 호출할 수 없다.
//		si.methodD();
		
	}//main

}//class
